import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutation {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			String str = bf.readLine();
			int n = str.length();
			List<String> anas = new ArrayList<>();
			permute(str, 0, n - 1, anas);
			Collections.sort(anas);
			for (String s : anas)
				System.out.print(s + " ");
			System.out.println();
		}

	}

	private static void permute(String str, int l, int r, List<String> anas) {
		if (l == r)
			anas.add(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, anas);
				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
