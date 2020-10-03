import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

        Example:

        Given the following matrix:

        [
        [ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]
        ]
        You should return

        [1, 2, 3, 6, 9, 8, 7, 4, 5]*/
public class SpiralOrderMatrixI_IB {
	public static void main(String[] args) throws IOException {
		// final List<ArrayList<Integer>> A = new ArrayList<>();

		// int arr[][] = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13,
		// 14, 15, 16}};
		// int arr[][] = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14,
		// 15}, {16, 17, 18, 19, 20},
		// {21, 22, 23, 24, 25}};

		// int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		// int row = 0;
		// int col = 0;
		//
		// int arrSize = arr[0].length;
		//
		// int rowEnd = arr[0].length;
		// int colEnd = arr[0].length;
		//
		// int result[] = new int[arrSize * arrSize];
		//
		// int x = 0;
		//
		// for (int u = 0; u < arrSize / 2; u++) {
		//
		// int i = row;
		// int j = col;
		//
		// int iEnd = rowEnd;
		// int jEnd = colEnd;
		//
		// // increasing
		//
		// for (; j < jEnd; j++) {
		// result[x++] = arr[i][j];
		// }
		// j--;
		// i++;
		// for (; i < iEnd; i++) {
		// result[x++] = arr[i][j];
		// }
		// i--;
		//
		// // decreasing
		//
		// j--;
		// for (; j >= col; j--) {
		// result[x++] = arr[i][j];
		// }
		// j++;
		//
		// i--;
		// for (; i > row; i--) {
		// result[x++] = arr[i][j];
		// }
		// i++;
		//
		// row++;
		// col++;
		//
		// rowEnd--;
		// colEnd--;
		// }
		//
		// if (arrSize % 2 != 0) {
		// result[x] = arr[arrSize / 2][arrSize / 2];
		// }
		// System.out.println(Arrays.toString(result));

		List<ArrayList<Integer>> A = new ArrayList<>();
		/*
		 * A.add(new ArrayList<Integer>() { { add(1); add(2); add(3); add(4); add(5); }
		 * }); A.add(new ArrayList<Integer>() { { add(6); add(7); add(8); add(9);
		 * add(10); } }); A.add(new ArrayList<Integer>() { { add(11); add(12); add(13);
		 * add(14); add(15); } });
		 */
		A.add(new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
			}
		});
		A.add(new ArrayList<Integer>() {
			{

				add(4);
				add(5);
				add(6);
			}
		});
		A.add(new ArrayList<Integer>() {
			{

				add(7);
				add(8);
				add(9);

			}
		});

		A.add(new ArrayList<Integer>() {
			{
				add(10);
				add(11);
				add(12);
			}
		});
		A.add(new ArrayList<Integer>() {
			{

				add(13);
				add(14);
				add(15);
			}
		});
		A.add(new ArrayList<Integer>() {
			{

				add(16);
				add(17);
				add(18);

			}
		});
		System.out.println(spiralOrder(A).toString());
	}

	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		int row = 0;
		int col = 0;

		int arrSize = Math.min(A.size(), A.get(0).size());

		int rowSize = A.size();
		int colSize = A.get(0).size();
		int rowEnd = rowSize;
		int colEnd = colSize;

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int u = 0; u < arrSize / 2; u++) {

			int i = row;
			int j = col;

			int iEnd = rowEnd;
			int jEnd = colEnd;

			// increasing

			for (; j < jEnd; j++) {
				result.add(A.get(i).get(j));
			}
			j--;
			i++;
			for (; i < iEnd; i++) {
				result.add(A.get(i).get(j));
			}
			i--;

			// decreasing

			j--;
			for (; j >= col; j--) {
				result.add(A.get(i).get(j));
			}
			j++;

			i--;
			for (; i > row; i--) {
				result.add(A.get(i).get(j));
			}
			i++;

			row++;
			col++;

			rowEnd--;
			colEnd--;
		}

		int x = Math.min(rowSize, colSize) / 2;
		for (int i = row; i < rowSize - x; i++) {
			for (int j = col; j < colSize - x; j++) {
				result.add(A.get(i).get(j));

			}
		}
		return result;
	}
}
