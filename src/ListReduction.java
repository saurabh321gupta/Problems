import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ListReduction {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strNum[] = bf.readLine().split("\\s");
		int n = Integer.parseInt(strNum[0]);
		int k = Integer.parseInt(strNum[1]);

		strNum = bf.readLine().split("\\s");
		long arr[] = new long[n];
		for (int i = 0; i < n; i++)
			arr[i] = Long.parseLong(strNum[i]);

		// Arrays.sort(arr);
		// arr[]

		while (k-- > 0) {
			long max = Long.MIN_VALUE;
			int maxI = 0;
			long min = Long.MAX_VALUE;
			int minI = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] > max) {
					max = arr[i];
					maxI = i;
				}

				if (arr[i] < min) {
					min = arr[i];
					minI = i;
				}
			}

			arr[maxI] = (long) Math.ceil((double) max / (double) 2);
			arr[minI] = min * 2;

		}

		long sum = 0;
		for (long x : arr)
			sum += x;

		System.out.println(sum);

	}
}
