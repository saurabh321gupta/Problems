import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeaponValue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bf.readLine());
			int arr[] = new int[10];
			while (n > 0) {
				String str = bf.readLine();
				for (int i = 0; i < 10; i++) {
					arr[i] ^= ((int) str.charAt(i) - 48);
				}
				n--;
			}
			int result = 0;
			for (int i = 0; i < 10; i++) {
				if (arr[i] == 1)
					result++;
			}
			System.out.println(result);
			t--;
		}
	}
}
