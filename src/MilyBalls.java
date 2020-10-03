import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//passed
public class MilyBalls {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //int t = Integer.parseInt(bf.readLine());
        while (true) {
            String strNum[] = bf.readLine().split("\\s");
            long n = Long.parseLong(strNum[0]);
            long k = Long.parseLong(strNum[1]);

            long x = (n * (n + 1)) / 2;
            if(k==0){
                System.out.println(x);
                continue;
            }
            if (k%x==0) {
                System.out.println("0");
            } else {
                long j = k / x;
                System.out.println((x * (j + 1)) - k);
            }
        }
    }
}
