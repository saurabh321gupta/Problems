import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringPermutation2 {
	public static void main(String[] args) throws IOException {
		String str = "abc";
		char[] arr = str.toCharArray();
		int n = str.length();
		List<String> perms = new ArrayList<>();
		permute(arr, 0, n, perms);
		for (String x : perms)
			System.out.println(x);
	}

	private static void permute(char[] arr, int start, int n, List<String> perms) {
		if (start == n) {
            perms.add(String.valueOf(arr));
            return;
        }

        for (int i = start; i < n; i++) {
            char temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            permute(arr.clone(), start + 1, n, perms);
            arr[i] = arr[start];
            arr[start] = temp;
        }
	}
}
