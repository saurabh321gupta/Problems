import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//passed
public class THEXORPROBLEM {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            char arr[] = bf.readLine().toCharArray();
            int k = Integer.parseInt(bf.readLine());

            for (char x : arr) {
                if (x == '0') {
                    if (k != 0) {
                        sb.append('1');
                        k--;
                    } else {
                        sb.append('0');
                    }
                } else {
                    sb.append('0');
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
