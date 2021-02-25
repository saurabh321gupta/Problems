import java.io.IOException;

public class EditDistance {
	public static void main(String[] args) throws IOException {
		String str1 = "abc";
		String str2 = "bcd";

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int m = str1.length();
		int n = str2.length();

		int dp[][] = new int[m + 1][n + 1];

		// prepare for len(str2) = 0 i.e. delete operations
		for (int i = 1; i <= m; i++)
			dp[i][0] = i;

		// prepare for len(str1) = 0 i.e. insert operations
		for (int i = 1; i <= n; i++)
			dp[0][n] = i;

		// Going right to left
		// Watch Tech Dose video for more clarity
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				int value;
				if (arr1[i - 1] == arr2[j - 1]) {
					value = dp[i - 1][j - 1];
				} else {
					// dp[i-1][j] = delete operation
					// dp[i][j-1] = insert operation
					// dp[i-1][j-1] = replace operation
					value = min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1;
				}
				dp[i][j] = value;
			}
		}

		System.out.println(dp[m][n]);
	}

	static int min(int... args) {
		int val = Integer.MAX_VALUE;
		for (int x : args)
			if (x < val)
				val = x;
		return val;
	}
}
