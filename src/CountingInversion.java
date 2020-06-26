import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//Hacker rank Merge Sort: Counting Inversions (solved with BIT All passed :)
public class CountingInversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            String strNum[] = bf.readLine().split("\\s");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strNum[i]);
            }
            int arr2[] = arr.clone();
            Arrays.sort(arr2);
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < n; i++) {
                map.put(arr2[i], i);
            }
            for (int i = 0; i < n; i++) {
                int x = arr[i];
                arr[i] = map.get(x) + 1;
            }

            int[] tree = new int[n + 1];
            long count = 0;
            for (int i = n - 1; i >= 0; i--) {
                int x = arr[i];
                int index = x;
                //update the tree
                while (index <= n) {
                    tree[index]++;
                    index = index + Integer.lowestOneBit(index);
                }

                index = x - 1;
                long sum = 0;
                //sum
                while (index > 0) {
                    sum += (long) tree[index];
                    index = index - Integer.lowestOneBit(index);
                }

                count += sum;
            }
            System.out.println(count);
        }
    }
}
