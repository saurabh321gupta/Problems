package JuneCookOffCodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//passed
public class CacheHits {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int b = Integer.parseInt(strNum[1]);
            int m = Integer.parseInt(strNum[2]);

            int cache = -1;
            strNum = bf.readLine().split("\\s");
            int count = 0;
            for (String str : strNum) {
                int x = Integer.parseInt(str);
                int block = x / b;
                if (cache != block) {
                    count++;
                    cache = block;
                }
            }
            System.out.println(count);
        }
    }
}
