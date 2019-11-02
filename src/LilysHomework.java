import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class LilysHomework {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int arr[] = new int[n];
		int arr2[] = new int[n];
		int sortedArr[] = new int[n];
		Map<Integer, Integer> map = new HashMap();
		Map<Integer, Integer> map2 = new HashMap();
		String[] strNum = bf.readLine().split("\\s");
		int sortedArrSize = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(strNum[i]);
			map.put(num, i);
			map2.put(num, i);
			arr[i] = num;
			arr2[i] = num;
			int x = sortedArrSize - 1;
			while (x >= 0 && num < sortedArr[x]) {
				sortedArr[x + 1] = sortedArr[x];
				x--;
			}
			sortedArr[x + 1] = num;
			sortedArrSize++;
		}
		int f = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != sortedArr[i]) {
				int index = map.get(sortedArr[i]);
				arr[i] = arr[i] + arr[index] - (arr[index] = arr[i]);
				map.put(arr[index], index);
				f++;
			}
			if (arr2[i] != sortedArr[n - 1 - i]) {
				int index = map2.get(sortedArr[n - 1 - i]);
				arr2[i] = arr2[i] + arr2[index] - (arr2[index] = arr2[i]);
				map2.put(arr2[index], index);
				b++;
			}
		}
		System.out.println(f < b ? f : b);
	}
}
