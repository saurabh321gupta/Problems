package codeChefJuneChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandPriceControl {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int k = Integer.parseInt(strNum[1]);
            strNum = bf.readLine().split("\\s");
            int lostRevenue = 0;
            for (String str : strNum) {
                int x = Integer.parseInt(str);
                lostRevenue += x > k ? (x - k) : 0;
            }
            System.out.println(lostRevenue);
        }
    }
}
