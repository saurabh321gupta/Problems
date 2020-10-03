import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilyMagicNumbersInclusionExclusion {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            long l = Long.parseLong(strNum[1]);
            long r = Long.parseLong(strNum[2]);

            int pos = 0;
            while (arr[pos] <= n) {
                pos++;
            }
            System.out.println(getCount(arr, r, pos) - getCount(arr, l - 1, pos));
        }
    }

    private static long getCount(int[] arr, long z, int pos) {
        int subsetCount = (1 << pos) - 1;
        long count = 0;
        while (subsetCount > 0) {
            long x = subsetCount;
            long mask = 1;
            long product = 1;
            int i = 0;
            int f = 0;
            while (x > 0) {
                if ((x & mask) != 0) {
                    product *= arr[i];
                    f++;
                }
                i++;
                x = x >> 1;
            }

            long cardinality = z / product;
            if (f % 2 == 0) {
                count -= cardinality;
            } else {
                count += cardinality;
            }
            subsetCount--;
        }
        return count;
    }
}
