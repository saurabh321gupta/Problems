import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StringPermutationSelfTry1 {

//	public static void main(String[] args) throws IOException {
//		String str = "ABC";
//		char[] arr = str.toCharArray();
//		perm(arr, 0, 3);
//	}

	public static void perm(char[] arr, int changeIndex, int size) {

		if (changeIndex == size -1) {
			System.out.println(String.valueOf(arr));
		}

		for (int i = changeIndex; i < size; i++) {
			swap(arr, changeIndex, i);
			perm(arr.clone(), changeIndex + 1, size);
			swap(arr, changeIndex, i);
		}
	}

	private static void swap(char[] arr, int changeIndex, int i) {
		char temp = arr[changeIndex];
		arr[changeIndex] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		mainLoop:
		while(t-->0){
			int n = Integer.parseInt(bf.readLine());
			String[] strNum = bf.readLine().split("\\s");
			int k = Integer.parseInt(bf.readLine());
			long[] arr = new long[n];
			for(int i=0;i<n;i++){
				arr[i] = Long.parseLong(strNum[i]);
			}

			int firstIndex = -1;
			int lastIndex = -1;
			Queue<Integer> queue = new LinkedList<>();
			for(int i=0;i<n;i++){
				if(isBNumber(arr[i])){
					queue.add(i);
					if(firstIndex==-1){
						firstIndex = i;
					}

					if(--k==0){
						lastIndex = i;
						break;
					}
				}
			}

			if(firstIndex==lastIndex){
				System.out.println("1");
				continue mainLoop;
			}else if(lastIndex==-1){
				System.out.println("-1");
				continue mainLoop;
			}

			int min = lastIndex-firstIndex+1;
			queue.remove();
			for(int i=lastIndex+1;i<n;i++){
				if(isBNumber(arr[i]))
				{
					firstIndex = queue.remove();
					queue.add(i);
					long num = arr[i]-firstIndex+1;
					if(num<min){
						num = min;
					}
				}
			}

			System.out.println(min);
		}
	}

	public static boolean isBNumber(long num){
		long x = (long) Math.sqrt(num);
		return x*x == num;
	}
}
