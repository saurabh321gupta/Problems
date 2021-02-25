import java.io.IOException;

public class DynamicPermutation {
	public static void main(String[] args) throws IOException {
		String str = "abcde";
		char[] arr = str.toCharArray();
		int length = arr.length;
		int n = 3;

		for (int i = 0; i <= (length - n); i++) {
			perm(str.substring(i, i + n).toCharArray(), 0, n);
		}

	}

	private static void perm(char[] arr, int l, int r) {
		if (l == r) {
			System.out.println(String.valueOf(arr));
		}

		for (int i = l; i < r; i++) {
			char temp = arr[l];
			arr[l] = arr[i];
			arr[i] = temp;
			perm(arr, l + 1, r);
			arr[i] = arr[l];
			arr[l] = temp;
		}
	}
}
