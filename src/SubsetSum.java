import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
/*Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
        Output: True
        There is a subset (4, 5) with sum 9.*/
public class SubsetSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true){
		String strNum[] = bf.readLine().split("\\s");
		int arr[] = new int[strNum.length];
		for (int i = 0; i < strNum.length; i++) {
			arr[i] = Integer.parseInt(strNum[i]);
		}
		arr = new int[]{ 89, 7, 41, 43, 65, 49, 47, 6, 91, 30, 71, 51, 7, 2, 94, 49, 30, 24, 85, 55, 57, 41, 67, 77, 32, 9, 45, 40, 27, 24, 38, 39, 19, 83, 30, 42, 34, 16, 40, 59, 5, 31, 78, 7, 74, 87, 22, 46, 25, 73, 71, 30, 78, 74, 98, 13, 87, 91, 62, 37, 56, 68 };

            int k = Integer.parseInt(bf.readLine());
		System.out.println(possible(arr, 0, 0, k));}
	}

	public static boolean possible(int[] arr, int sum, int index, int givenSum) {
		if (index == arr.length) {
			if (sum == givenSum) {
				return true;
			} else {
				return false;
			}
		}
		if (sum == givenSum) {
			return true;
		}
		if (sum > givenSum) {
			return false;
		}
		return possible(arr, sum + arr[index], index + 1, givenSum) || possible(arr, sum, index + 1, givenSum);
	}

}
