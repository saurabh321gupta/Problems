import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TomAndJerry {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			char[] arr1 = bf.readLine().toCharArray();
			char[] arr2 = bf.readLine().toCharArray();

			int p = 0;
			for (char x : arr1) {
				if (p == arr2.length) {
					break;
				}
				if (x == arr2[p]) {
					p++;
				}
			}
			if (p == arr2.length) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
