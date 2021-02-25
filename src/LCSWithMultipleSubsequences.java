import java.io.IOException;
import java.util.*;

public class LCSWithMultipleSubsequences {
	public static void main(String[] args) throws IOException {
		String str1 = "axbycz";//"abcdefg";
		String str2 = "xaybzc";//"abdcfg";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		int m = arr1.length;
		int n = arr2.length;

		int[][] arr = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++)
			for (int j = 1; j <= n; j++) {
				int value;
				if (arr1[i - 1] == arr2[j - 1]) {
					value = arr[i - 1][j - 1] + 1;
				} else {
					value = Math.max(arr[i][j - 1], arr[i - 1][j]);
				}
				arr[i][j] = value;
			}

		Set<String> resultList = new TreeSet<>();
		char result[] = new char[arr[m][n]];
		printLCS(arr1, arr2, m, n, arr, result, resultList);
		resultList.forEach(x -> System.out.println(x));
	}

	public static void printLCS(char[] arr1, char[] arr2, int m, int n, int[][] arr, char[] result,
			Set<String> resultList) {
		int lcs = arr[m][n];

		if (lcs == 0) {
			resultList.add(String.valueOf(result));
			return;
		}

		if (Math.max(arr[m][n - 1], arr[m - 1][n]) != lcs) {
			result[lcs - 1] = arr1[m-1];
			printLCS(arr1, arr2, m - 1, n - 1, arr, result, resultList);
		} else {
			if (arr[m][n - 1] > arr[m - 1][n]) {
				printLCS(arr1, arr2, m, n - 1, arr, result, resultList);
			} else if (arr[m][n - 1] < arr[m - 1][n]) {
				printLCS(arr1, arr2, m - 1, n, arr, result, resultList);
			} else {
				printLCS(arr1, arr2, m, n - 1, arr, result.clone(), resultList);
				printLCS(arr1, arr2, m - 1, n, arr, result.clone(), resultList);
			}
		}
	}



}
