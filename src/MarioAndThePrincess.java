import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarioAndThePrincess {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			String strNum[] = bf.readLine().split("\\s");
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(strNum[i]);
			int max = 0;
			int curr = 1;
			boolean seq = true;
			for (int i = 1; i < n; i++) {
				if (seq) {
					if (arr[i] >= arr[i - 1]) {
						if (++curr > max)
							max = curr;
					} else {
						curr = 2;
						seq = false;
						if (curr > max)
							max = curr;
					}
				} else {
					if (arr[i] <= arr[i - 1]) {
						if (++curr > max)
							max = curr;
					} else {
						curr = 2;
						seq = true;
						if (curr > max)
							max = curr;
					}
				}
			}
			System.out.println(max);
		}
	}
}
