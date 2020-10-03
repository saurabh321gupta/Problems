import java.io.IOException;
import java.util.Arrays;

/*Problem Statement:-

        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
public class DCP_1_Without_division {
	public static void main(String[] args) throws IOException {
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int prefix[] = new int[n + 1];
		int suffix[] = new int[n + 2];
		prefix[0] = 1;
		suffix[n + 1] = 1;
		for (int i = 1; i <= n; i++) {
			prefix[i] = prefix[i - 1] * arr[i - 1];
			int x = n + 1 - i;
			suffix[x] = suffix[x + 1] * arr[x - 1];
		}

		for (int i = 1; i <= n; i++) {
			arr[i - 1] = prefix[i - 1] * suffix[i + 1];
		}
		System.out.println(Arrays.toString(arr));
	}
}
