import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LCS {
	public static void main(String[] args) throws IOException {
		String str1 = "abcdefg";
		String str2 = "abxdfg";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		int m = arr1.length;
		int n = arr2.length;

		Map<String, Integer> LCS = new HashMap();

		System.out.println(findLCS(LCS, 0, 0, m, n, arr1, arr2));

	}

	private static int findLCS(Map<String, Integer> lcs, int i, int j, int m, int n, char[] arr1, char[] arr2) {
		if (i >= m || j >= n)
			return 0;

		String key = "" + i + "-" + j;
		if (lcs.containsKey(key)) {
			return lcs.get(key);
		} else {
			int result;
			if (arr1[i] == arr2[j]) {
				result = 1 + findLCS(lcs, i + 1, j + 1, m, n, arr1, arr2);
			} else {
				result = Math.max(findLCS(lcs, i, j + 1, m, n, arr1, arr2), findLCS(lcs, i + 1, j, m, n, arr1, arr2));
			}
			lcs.put(key, result);
		}
		return lcs.get(key);
	}
}
