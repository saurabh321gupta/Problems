import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strNum = bf.readLine().split("\\s");
		int arr[] = new int[strNum.length];
		for (int i = 0; i < strNum.length; i++)
			arr[i] = Integer.parseInt(strNum[i]);
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < strNum.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int index = start;
		int pivot = arr[end];
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				arr[i] = arr[i] + arr[index] - (arr[index] = arr[i]);
				index++;
			}
		}
		arr[end] = arr[index];
		arr[index] = pivot;
		quickSort(arr, start, index - 1);
		quickSort(arr, index + 1, end);
	}
}
