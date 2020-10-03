import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryString_IP {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String b = bf.readLine();

		int i = a.length() - 1;
		int j = b.length() - 1;

		String result = "";
		int s = 0;

		while (i >= 0 || j >= 0 || s == 1) {
			s += (i < 0 ? 0 : (a.charAt(i) - '0'));
			s += (j < 0 ? 0 : (b.charAt(j) - '0'));

			result = ((char) (s % 2 + '0')) + result;

			s /= 2;

			i--;j--;
		}
        System.out.println(result);

	}
}
