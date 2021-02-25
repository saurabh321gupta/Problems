import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class YYY {
	public static void main(String[] args) throws IOException {
		int arr[] = {1, 7, 12, 13, 15};



		//Arrays.sort(arr, Comparator.comparing(x->countSetBits(x)));
		sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int start, int end) {
		if (start == end) {
			return;
		}

		int mid = (start + end) / 2;

		sort(arr, start, mid);
		sort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {

		int arr1[] = new int[mid - start];
		int arr2[] = new int[end - mid];

		int i = arr1.length;
		int j = arr2.length;

		for (int x = 0; x < i; x++) {
			arr1[x] = arr[start + x];
		}

		for (int x = 0; x < j; x++) {
			arr2[x] = arr[mid + 1 + x];
		}

		int n1 = 0;
		int n2 = 0;

		int x = start;

		while (n1 < i && n2 < j) {

			int countN1 = countSetBits(arr1[n1]);
			int countN2 = countSetBits(arr2[n2]);

			if (countN1 > countN2) {
				arr[x] = arr1[n1];
				n1++;
			} else if (countN2 > countN1) {
				arr[x] = arr2[n2];
				n2++;
			} else {
				if (arr1[n1] > arr2[n2]) {
					arr[x] = arr1[i];
					n1++;
				} else {
					arr[x] = arr2[j];
					n2++;
				}
			}
		}

		while (n1 < i) {
			arr[x] = arr1[n1];
			n1++;
			x++;
		}

		while (n2 < j) {
			arr[x] = arr2[n2];
			n2++;
			x++;
		}

	}

	public static int countSetBits(int x) {
		int count = 0;
		while (x != 0) {
			if ((x & 1) == 1) {
				count++;
			}
			x = x >> 1;
		}
		return count;
	}

}
