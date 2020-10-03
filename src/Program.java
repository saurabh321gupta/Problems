import java.io.IOException;

public class Program {
	/*
	 * public static void main(String[] args) throws IOException { int arr[] =
	 * {1,7,9,1,3,7,1};
	 * 
	 * for(int i=0;i<arr.length;i++){ if(arr[i]!=-1){ int j = i+1;
	 * while(j<arr.length){ if(arr[j]==arr[i]) arr[j] = -1; j++; }
	 * System.out.println(arr[i]); } } }
	 */

	public static void main(String[] args) throws IOException {
		int arr[] = {1, 7, 9, 1, 300000000, 7, 1};

		int max = Integer.MIN_VALUE;
		for (int x : arr)
			if (x > max)
				max = x;

		int arr2[] = new int[max + 1];

		for (int x : arr)
		    arr2[x] = 1;

		for(int i=0;i<arr2.length;i++)
		    if(arr2[i]==1)
                System.out.println(i);
	}
}
