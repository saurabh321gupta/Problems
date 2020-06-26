package JuneCookOffCodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMex {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            strNum = bf.readLine().split("\\s");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strNum[i]);
            }
            Arrays.sort(arr);
            for (int i = n - 1; )
        }
    }
}
