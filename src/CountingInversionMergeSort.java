import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//32
public class CountingInversionMergeSort {

	static long count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine().trim());
		while (t-- > 0) {
			count = 0;
			int n = Integer.parseInt(bf.readLine().trim());
			String strNum[] = bf.readLine().split("\\s");
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(strNum[i]);
			}
			countInversions(arr, 0, n - 1);
			System.out.println(count);
		}
	}

	public static void countInversions(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		countInversions(arr, start, mid);
		countInversions(arr, mid + 1, end);
		mergeParts(arr, start, mid, end);
	}

	private static void mergeParts(int[] arr, int start, int mid, int end) {
		int left[] = new int[mid - start + 1];
		int right[] = new int[end - mid];

		int p = 0;

		for (int i = start; i <= mid; i++)
			left[p++] = arr[i];

		p = 0;
		for (int i = mid + 1; i <= end; i++)
			right[p++] = arr[i];

		int i = 0;
		int j = 0;

		p = start;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				count += (left.length - i);
				arr[p++] = right[j];
				j++;
			} else {
				arr[p++] = left[i];
				i++;
			}
		}

		while (i < left.length) {
			arr[p++] = left[i++];
		}

		while (j < right.length) {
			arr[p++] = right[j++];
		}
	}
}
