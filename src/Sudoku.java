import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sudoku {

	static int unsolved = 0;
	static Set<Integer>[] missingElementsInRows;
	static Set<Integer>[] missingElementsInCols;
	static Set<Integer>[] missingElementsInBlocks;
	static Set<String>[][] sudokuPossiblePlacesBlockWise;
	static Set<String>[][] sudokuPossiblePlacesRowWise;
	static Set<String>[][] sudokuPossiblePlacesColWise;
	static Map<String, Set<String>>[] patterns;
	static int n;
	static int sudoku[][];

	static int blockSize;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// size of sudoku
		n = Integer.parseInt(bf.readLine());
		// sudoku itself
		sudoku = new int[n][n];

		blockSize = (int) Math.sqrt(n);

		Set[][] sudokuPossibleValues = new Set[n][n];
		sudokuPossiblePlacesBlockWise = new HashSet[n][n + 1];
		sudokuPossiblePlacesRowWise = new HashSet[n][n + 1];
		sudokuPossiblePlacesColWise = new HashSet[n][n + 1];
		missingElementsInRows = new Set[n];
		missingElementsInCols = new Set[n];
		missingElementsInBlocks = new Set[n];
		patterns = new Map[n];

		fillAllNumbersInMissingElementTrackers(n);

		for (int i = 0; i < n; i++) {
			String strNum[] = bf.readLine().split("\\s");
			for (int j = 0; j < n; j++) {
				int value = Integer.parseInt(strNum[j]);
				sudoku[i][j] = value;
				sudokuPossibleValues[i][j] = new HashSet();
				if (value != 0) {
					missingElementsInRows[i].remove(value);
					missingElementsInCols[j].remove(value);
					int blockNumber = indicesToBlockNumber(i, j, blockSize);
					missingElementsInBlocks[blockNumber].remove(value);
					sudokuPossibleValues[i][j].add(value);
				} else {
					unsolved++;
					addAllPossibleValues(sudokuPossibleValues[i][j], n);
				}
			}
		}

		fillSudokuPossiblePlacesBlockWise();
		fillPossiblePlacesRowWise();
		fillPossiblePlacesColWise();

		while (unsolved > 0) {
			boolean resolvedAtleastOne = false;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (sudoku[i][j] == 0) {
						resolvedAtleastOne = resolve(sudoku, i, j, sudokuPossibleValues, blockSize, n);
					}
				}
			}

			if (!resolvedAtleastOne) {
				System.out.println("STUCK!!!!");
				resolvedAtleastOne = resolveSecondLayer();
			}

			if (!resolvedAtleastOne) {
				System.out.println("STCUK AT SECOND LAYER!!!!");
				for (int i = 0; i < n; i++)
					System.out.println(Arrays.toString(sudoku[i]));
				resolvedAtleastOne = resolveThirdLayer();
			}

			if (!resolvedAtleastOne) {
				System.out.println("STCUK AT THIRD LAYER!!!!");
				for (int i = 0; i < n; i++)
					System.out.println(Arrays.toString(sudoku[i]));
				resolvedAtleastOne = resolveFourthLayer();
			}

			if (!resolvedAtleastOne) {
				System.out.println("STCUK AT FOURTH LAYER!!!!");
				for (int i = 0; i < n; i++)
					System.out.println(Arrays.toString(sudoku[i]));
				resolvedAtleastOne = resolveFifthLayer();
				resolveSecondLayer();
			}

			if (!resolvedAtleastOne) {
				System.out.println("STCUK AT FIFTH LAYER!!!!");
				for (int i = 0; i < n; i++)
					System.out.println(Arrays.toString(sudoku[i]));
				resolvedAtleastOne = resolveSixthLayer();
				resolveSecondLayer();
			}

			if (!resolvedAtleastOne) {
				System.out.println("STCUK AT SIXTH LAYER!!!!");
				for (int i = 0; i < n; i++)
					System.out.println(Arrays.toString(sudoku[i]));
				return;
			}
		}

		for (int i = 0; i < n; i++)
			System.out.println(Arrays.toString(sudoku[i]));

	}

	private static boolean resolveSixthLayer() {
		boolean resolved = false;
		for (int i = 0; i < n; i++) {
			for (int element : missingElementsInBlocks[i]) {
				Set<String> places = sudokuPossiblePlacesBlockWise[i][element];
				Set<Integer> rows = getIndices(places, 0);
				Set<Integer> cols = getIndices(places, 1);

				if (rows.size() == 1) {
					resolved = true;
					int row = rows.iterator().next();
					if (missingElementsInRows[row].contains(element)) {
						sudokuPossiblePlacesRowWise[row][element].removeIf(x -> !places.contains(x));
					}

					int startBlock = (i / blockSize) * blockSize;
					removeFromAdjacentBlocksRowWise(i, startBlock, new HashSet<>(element), row);

					for (int x = 0; x < n; x++) {
						if (missingElementsInCols[x].contains(element))
							sudokuPossiblePlacesColWise[x][element].remove(indicesToString(row, x));
					}
				}

				if (cols.size() == 1) {
					resolved = true;
					int col = cols.iterator().next();
					if (missingElementsInCols[col].contains(element)) {
						sudokuPossiblePlacesColWise[col][element].removeIf(x -> !places.contains(x));
					}
					int startBlock = i % blockSize;
					removeFromAdjacentBlocksColWise(i, startBlock, new HashSet<>(element), col);
					for (int x = 0; x < n; x++) {
						if (missingElementsInRows[x].contains(element))
							sudokuPossiblePlacesRowWise[x][element].remove(indicesToString(x, col));
					}
				}

			}

		}
		return resolved;
	}

	private static boolean resolveThirdLayer() {
		boolean resolved = false;
		for (int i = 0; i < n; i++) {
			Set<Integer> missingElements = new HashSet<>(missingElementsInRows[i]);

			for (int element : missingElements) {
				if (sudokuPossiblePlacesRowWise[i][element] != null
						&& sudokuPossiblePlacesRowWise[i][element].size() == 1) {
					int[] indices = stringToIndices(sudokuPossiblePlacesRowWise[i][element].iterator().next());
					int row = indices[0];
					int col = indices[1];
					sudoku[row][col] = element;
					cleanUpAfterAResolve(row, col, element);
					unsolved--;
					resolved = true;
				}
			}
		}
		return resolved;
	}

	private static boolean resolveFourthLayer() {
		boolean resolved = false;
		for (int i = 0; i < n; i++) {
			Set<Integer> missingElements = new HashSet<>(missingElementsInCols[i]);
			for (int element : missingElements) {
				if (sudokuPossiblePlacesColWise[i][element] != null
						&& sudokuPossiblePlacesColWise[i][element].size() == 1) {
					int[] indices = stringToIndices(sudokuPossiblePlacesColWise[i][element].iterator().next());
					int row = indices[0];
					int col = indices[1];
					sudoku[row][col] = element;
					cleanUpAfterAResolve(row, col, element);
					unsolved--;
					resolved = true;
				}
			}
		}
		return resolved;
	}

	public static void cleanUpAfterAResolve(int row, int col, int element) {

		int blockNumber = indicesToBlockNumber(row, col, blockSize);

		missingElementsInRows[row].remove(element);
		missingElementsInCols[col].remove(element);
		missingElementsInBlocks[blockNumber].remove(element);

		sudokuPossiblePlacesRowWise[row][element] = null;
		sudokuPossiblePlacesColWise[col][element] = null;
		sudokuPossiblePlacesBlockWise[blockNumber][element] = null;

		removePossiblePlace(row, col);
	}

	private static boolean resolveFifthLayer() {
		boolean resolve = false;
		for (int i = 0; i < n; i++) {
			Set<Integer> missingElements = missingElementsInBlocks[i];
			Integer missingElementsArray[] = new Integer[missingElements.size()];
			int j = 0;
			for (int x : missingElements)
				missingElementsArray[j++] = x;

			int blockNumber = i;
			Arrays.sort(missingElementsArray,
					Comparator.comparing(x -> sudokuPossiblePlacesBlockWise[blockNumber][x].size()));

			Map<String, Set<String>> pattern = new LinkedHashMap<>();
			createPattern(i, 0, new HashSet<>(), 0, "", pattern, missingElementsArray);
			patterns[i] = pattern;
			resolve = resolve || resolvePattern(pattern, missingElements, sudokuPossiblePlacesBlockWise[blockNumber],
					blockNumber);
		}

		return resolve;
	}

	private static boolean resolvePattern(Map<String, Set<String>> pattern, Set<Integer> missingElements,
			Set<String>[] sudokuPossiblePlaces, int blockNumber) {
		boolean resolved = false;
		int missingElementsCount = missingElements.size();
		if (patternExists(pattern, missingElementsCount)) {
			resolved = true;
			for (Map.Entry<String, Set<String>> e : pattern.entrySet()) {
				Set<String> places = e.getValue();
				Set<Integer> numbers = new HashSet<>();
				for (char x : e.getKey().toCharArray()) {
					numbers.add(Character.getNumericValue(x));
				}
				removePatternPlacesFromOtherElements(missingElements, sudokuPossiblePlaces, places, numbers);

				Set<Integer> rows = getIndices(places, 0);
				Set<Integer> cols = getIndices(places, 1);

				if (rows.size() == 1) {
					int row = rows.iterator().next();
					removePatternPlacesFromOtherElements(missingElementsInRows[row], sudokuPossiblePlacesRowWise[row],
							places, numbers);
					addPatternPlacesToElements(missingElementsInRows[row], sudokuPossiblePlacesRowWise[row], places,
							numbers);

					int startBlock = (blockNumber / blockSize) * blockSize;
					removeFromAdjacentBlocksRowWise(blockNumber, startBlock, numbers, row);

					for (int x = 0; x < n; x++) {
						for (int element : numbers) {
							if (missingElementsInCols[x].contains(element))
								sudokuPossiblePlacesColWise[x][element].remove(indicesToString(row, x));
						}
					}
				}

				if (cols.size() == 1) {
					int col = cols.iterator().next();
					removePatternPlacesFromOtherElements(missingElementsInCols[col], sudokuPossiblePlacesColWise[col],
							places, numbers);
					addPatternPlacesToElements(missingElementsInCols[col], sudokuPossiblePlacesColWise[col], places,
							numbers);
					int startBlock = blockNumber % blockSize;
					removeFromAdjacentBlocksColWise(blockNumber, startBlock, numbers, col);
					for (int x = 0; x < n; x++) {
						for (int element : numbers) {
							if (missingElementsInRows[x].contains(element))
								sudokuPossiblePlacesRowWise[x][element].remove(indicesToString(x, col));
						}
					}
				}
			}
		}
		return resolved;
	}

	private static void removePatternPlacesFromOtherElements(Set<Integer> missingElements,
			Set<String>[] sudokuPossiblePlaces, Set<String> places, Set<Integer> numbers) {
		missingElements.stream().filter(x -> !numbers.contains(x))
				.forEach(x -> sudokuPossiblePlaces[x].removeAll(places));
	}

	private static void addPatternPlacesToElements(Set<Integer> missingElements, Set<String>[] sudokuPossiblePlaces,
			Set<String> places, Set<Integer> numbers) {
		missingElements.stream().filter(x -> numbers.contains(x))
				.forEach(x -> sudokuPossiblePlaces[x].removeIf(y -> !places.contains(y)));
	}

	private static Set<Integer> getIndices(Set<String> places, int index) {
		Set<Integer> result = new HashSet<>();
		for (String x : places) {
			result.add(Character.getNumericValue(x.charAt(index)));
		}
		return result;
	}

	public static void createPattern(int blockNumber, int elementIndex, Set<String> values, int count, String numbers,
			Map<String, Set<String>> patterns, Integer[] missingElementsArray) {

		if (elementIndex == missingElementsArray.length) {
			return;
		}

		Set<String> with = new HashSet<>(values);
		int element = missingElementsArray[elementIndex];
		with.addAll(sudokuPossiblePlacesBlockWise[blockNumber][element]);
		if (count + 1 == with.size()) {
			patterns.put(numbers + "" + element, with);
		} else {
			createPattern(blockNumber, elementIndex + 1, with, count + 1, numbers + "" + element, patterns,
					missingElementsArray);
		}

		createPattern(blockNumber, elementIndex + 1, values, count, numbers, patterns, missingElementsArray);
	}

	public static boolean patternExists(Map<String, Set<String>> patterns, int missingElementsCount) {
		return patterns.keySet().iterator().next().length() < missingElementsCount;
	}

	private static void fillPossiblePlacesRowWise() {
		for (int i = 0; i < n; i++) {
			Set<Integer> missingElememts = missingElementsInRows[i];
			int startBlockNumber = (i / blockSize) * blockSize;
			for (int element : missingElememts) {
				for (int j = 0; j < blockSize; j++) {
					int blockNumber = j + startBlockNumber;
					if (missingElementsInBlocks[blockNumber].contains(element)) {
						int indices[] = blockNumberToStartIndices(blockNumber, blockSize);
						for (int col = 0; col < blockSize; col++) {
							int colNumber = indices[1] + col;
							if (missingElementsInCols[colNumber].contains(element) && sudoku[i][colNumber] == 0) {
								Set<String> set = sudokuPossiblePlacesRowWise[i][element];
								if (set == null) {
									set = new HashSet<>();
								}
								set.add(indicesToString(i, colNumber));
								sudokuPossiblePlacesRowWise[i][element] = set;
							}
						}

					}
				}
			}
		}
	}

	private static void fillPossiblePlacesColWise() {
		for (int i = 0; i < n; i++) {
			Set<Integer> missingElememts = missingElementsInCols[i];
			int startBlockNumber = (i / blockSize);
			for (int element : missingElememts) {
				for (int j = 0; j < blockSize; j++) {
					int blockNumber = (blockSize * j) + startBlockNumber;
					if (missingElementsInBlocks[blockNumber].contains(element)) {
						int indices[] = blockNumberToStartIndices(blockNumber, blockSize);
						for (int row = 0; row < blockSize; row++) {
							int rowNumber = indices[0] + row;
							if (missingElementsInRows[rowNumber].contains(element) && sudoku[rowNumber][i] == 0) {
								Set<String> set = sudokuPossiblePlacesColWise[i][element];
								if (set == null) {
									set = new HashSet<>();
								}
								set.add(indicesToString(rowNumber, i));
								sudokuPossiblePlacesColWise[i][element] = set;
							}
						}

					}
				}
			}
		}
	}

	private static boolean resolveSecondLayer() {
		boolean resolved = false;
		for (int i = 0; i < n; i++) {
			Set<Integer> missingElements = new HashSet<>(missingElementsInBlocks[i]);
			for (int element : missingElements) {
				if (sudokuPossiblePlacesBlockWise[i][element] != null
						&& sudokuPossiblePlacesBlockWise[i][element].size() == 1) {
					int[] indices = stringToIndices(sudokuPossiblePlacesBlockWise[i][element].iterator().next());
					int row = indices[0];
					int col = indices[1];
					sudoku[row][col] = element;
					cleanUpAfterAResolve(row, col, element);
					unsolved--;
					resolved = true;
				}
			}
		}
		return resolved;
	}

	private static void fillAllNumbersInMissingElementTrackers(int n) {
		for (int y = 0; y < n; y++) {
			missingElementsInCols[y] = new HashSet<>();
			missingElementsInRows[y] = new HashSet<>();
			missingElementsInBlocks[y] = new HashSet<>();
			for (int x = 1; x <= n; x++) {
				missingElementsInCols[y].add(x);
				missingElementsInRows[y].add(x);
				missingElementsInBlocks[y].add(x);
			}
		}
	}

	private static boolean resolve(int[][] sudoku, int i, int j, Set[][] sudokuPossibleValues, int blockSize, int n) {

		boolean resolved = false;

		int rowBlock = getBlock(i, blockSize);
		int colBlock = getBlock(j, blockSize);

		for (int x = 0; x < n; x++) {
			if (sudoku[i][x] != 0) {
				sudokuPossibleValues[i][j].remove(sudoku[i][x]);
			}
			if (sudoku[x][j] != 0) {
				sudokuPossibleValues[i][j].remove(sudoku[x][j]);
			}
		}

		int startIndexI = rowBlock * blockSize;
		int endIndexI = startIndexI + blockSize;
		int startIndexJ = colBlock * blockSize;
		int endIndexJ = startIndexJ + blockSize;
		for (int x = startIndexI; x < endIndexI; x++) {
			for (int y = startIndexJ; y < endIndexJ; y++) {
				if (sudoku[x][y] != 0) {
					sudokuPossibleValues[i][j].remove(sudoku[x][y]);
				}
			}
		}

		if (sudokuPossibleValues[i][j].size() == 1) {
			sudoku[i][j] = (int) sudokuPossibleValues[i][j].iterator().next();
			missingElementsInRows[i].remove(sudoku[i][j]);
			missingElementsInCols[j].remove(sudoku[i][j]);

			int blockNumber = indicesToBlockNumber(i, j, blockSize);
			missingElementsInBlocks[blockNumber].remove(sudoku[i][j]);
			sudokuPossiblePlacesBlockWise[blockNumber][sudoku[i][j]] = null;
			sudokuPossiblePlacesRowWise[i][sudoku[i][j]] = null;
			sudokuPossiblePlacesColWise[j][sudoku[i][j]] = null;
			removePossiblePlace(i, j);
			unsolved--;
			resolved = true;
		}
		return resolved;
	}

	private static int getBlock(int i, int blockSize) {
		return i / blockSize;
	}

	public static void removePossiblePlace(int i, int j) {
		String stringCorrespondingToIndices = indicesToString(i, j);
		for (int element : missingElementsInRows[i]) {
			if (sudokuPossiblePlacesRowWise[i][element] != null) {
				sudokuPossiblePlacesRowWise[i][element].remove(stringCorrespondingToIndices);
			}
		}

		int blockNumber = indicesToBlockNumber(i, j, blockSize);
		for (int element : missingElementsInBlocks[blockNumber]) {
			if (sudokuPossiblePlacesBlockWise[blockNumber][element] != null) {
				sudokuPossiblePlacesBlockWise[blockNumber][element].remove(stringCorrespondingToIndices);
			}
		}

		for (int element : missingElementsInCols[j]) {
			if (sudokuPossiblePlacesRowWise[j][element] != null) {
				sudokuPossiblePlacesRowWise[j][element].remove(stringCorrespondingToIndices);
			}
		}

		int[] startIndices = blockNumberToStartIndices(blockNumber, blockSize);
		int element = sudoku[i][j];

		for (int x = startIndices[0]; x < startIndices[0] + blockSize; x++) {
			for (int y = startIndices[1]; y < startIndices[1] + blockSize; y++) {
				if (sudoku[x][y] == 0) {
					if (sudokuPossiblePlacesRowWise[x][sudoku[i][j]] != null) {
						sudokuPossiblePlacesRowWise[x][sudoku[i][j]].remove(indicesToString(x, y));
					}
					if (sudokuPossiblePlacesColWise[y][sudoku[i][j]] != null) {
						sudokuPossiblePlacesColWise[y][sudoku[i][j]].remove(indicesToString(x, y));
					}
				}
			}
		}

		// remove place from every row of that clomun and every column of that row for
		// this element
		for (int x = 0; x < n; x++) {
			// every row of that column
			if (missingElementsInRows[x].contains(element)) {
				sudokuPossiblePlacesRowWise[x][element].remove(indicesToString(x, j));
			}

			// every column of that row
			if (missingElementsInCols[x].contains(element)) {
				sudokuPossiblePlacesColWise[x][element].remove(indicesToString(i, x));
			}

		}

		// remove from adjacent blocks for that element
		int startBlock = (blockNumber / blockSize) * blockSize;
		removeFromAdjacentBlocksRowWise(blockNumber, startBlock, new HashSet<>(element), i);
		int startBlock2 = blockNumber % blockSize;
		removeFromAdjacentBlocksColWise(blockNumber, startBlock2, new HashSet<>(element), j);

	}

	public static void removeFromAdjacentBlocksRowWise(int blockNumberOfElements, int startBlockNumber,
			Set<Integer> elements, int row) {
		for (int i = 0; i < blockSize; i++) {
			int currentBlock = i + startBlockNumber;
			if (currentBlock != blockNumberOfElements) {
				int startIndices[] = blockNumberToStartIndices(currentBlock, blockSize);

				Set<String> places = new HashSet<>();
				for (int col = 0; col < blockSize; col++) {
					int currentCol = startIndices[1] + col;
					String place = indicesToString(row, currentCol);
					places.add(place);
				}

				for (int element : elements) {
					if (missingElementsInBlocks[currentBlock].contains(element)) {
						sudokuPossiblePlacesBlockWise[currentBlock][element].removeAll(places);
					}
				}
			}
		}
	}

	public static void removeFromAdjacentBlocksColWise(int blockNumberOfElements, int startBlockNumber,
			Set<Integer> elements, int col) {
		int currentBlock = startBlockNumber;
		for (int i = 0; i < blockSize; i++) {
			if (currentBlock != blockNumberOfElements) {
				int startIndices[] = blockNumberToStartIndices(currentBlock, blockSize);

				Set<String> places = new HashSet<>();
				for (int row = 0; row < blockSize; row++) {
					int currentRow = startIndices[0] + row;
					String place = indicesToString(currentRow, col);
					places.add(place);
				}

				for (int element : elements) {
					if (missingElementsInBlocks[currentBlock].contains(element)) {
						sudokuPossiblePlacesBlockWise[currentBlock][element].removeAll(places);
					}
				}
			}
			currentBlock += blockSize;
		}
	}

	public static void addAllPossibleValues(Set set, int n) {
		for (int i = 1; i <= n; i++)
			set.add(i);
	}

	public static int[] blockNumberToStartIndices(int blockNumber, int blockSize) {
		int rowIndex = (blockNumber / blockSize) * blockSize;
		int colIndex = (blockNumber % blockSize) * blockSize;

		return new int[]{rowIndex, colIndex};
	}

	public static int indicesToBlockNumber(int i, int j, int blockSize) {
		int rowIndex = i / blockSize;
		int colIndex = j / blockSize;

		return (rowIndex * blockSize) + colIndex;
	}

	public static String indicesToString(int i, int j) {
		return i + "" + j;
	}

	public static int[] stringToIndices(String str) {
		return new int[]{Character.getNumericValue(str.charAt(0)), Character.getNumericValue(str.charAt(1))};
	}

	public static void fillSudokuPossiblePlacesBlockWise() {

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				sudokuPossiblePlacesBlockWise[i][j] = new HashSet<>();
			}
		}

		for (int i = 0; i < n; i++) {
			int[] startingIndices = blockNumberToStartIndices(i, blockSize);
			for (int x = 0; x < blockSize; x++) {
				int iIndex = startingIndices[0] + x;
				for (int y = 0; y < blockSize; y++) {
					int jIndex = startingIndices[1] + y;
					if (sudoku[iIndex][jIndex] != 0) {
						sudokuPossiblePlacesBlockWise[i][sudoku[iIndex][jIndex]] = null;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (sudokuPossiblePlacesBlockWise[i][j] != null) {
					int[] startIndices = blockNumberToStartIndices(i, blockSize);
					for (int x = 0; x < blockSize; x++) {
						if (missingElementsInRows[(startIndices[0] + x)].contains(j)) {
							for (int y = 0; y < blockSize; y++) {
								if (missingElementsInCols[(startIndices[1] + y)].contains(j)
										&& sudoku[startIndices[0] + x][startIndices[1] + y] == 0) {
									sudokuPossiblePlacesBlockWise[i][j]
											.add(indicesToString((startIndices[0] + x), (startIndices[1] + y)));
								}
							}
						}
					}
				}
			}
		}
	}

}
