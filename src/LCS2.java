import java.io.IOException;
import java.util.Arrays;

public class LCS2 {
	public static void main(String[] args) throws IOException {
		String str1 = "abcdefg";
		String str2 = "abdcfg";

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
		int ans = arr[m][n];
		char result[] = new char[ans];
		while (ans != 0) {
			if (arr1[m-1]==arr2[n-1]) {
				m--;
				n--;
				result[ans - 1] = arr1[m];
			} else {
				if (arr[m][n - 1] > arr[m - 1][n]) {
					n--;
				} else {
					m--;
				}
			}
			ans = arr[m][n];
		}

		System.out.println(Arrays.toString(result));
	}


}
