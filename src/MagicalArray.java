import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//passed
public class MagicalArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            long x = Long.parseLong(strNum[1]);

            strNum = bf.readLine().split("\\s");
            long sum = 0;
            long prev = 0;
            for (int i = 0; i < n; i++) {
                long curr = Long.parseLong(strNum[i]);
                if(curr<=prev){
                    long z = ((prev-curr)/x)+1;
                    sum+=z;
                    curr = curr+ (z*x);
                }
                prev = curr;
            }
            System.out.println(sum);
        }
    }
}
