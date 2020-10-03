import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilyMagicNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 52};
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            long l = Long.parseLong(strNum[1]);
            long r = Long.parseLong(strNum[2]);

            int pos = 0;
            while (arr[pos] <= n) {
                pos++;
            }
            long count = 0;
            for (; l <= r; l++) {
                smallLoop:
                for (int i = 0; i < pos; i++) {
                    if (l % arr[i] == 0) {
                        System.out.print(l + " ");
                        count++;
                        break smallLoop;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
