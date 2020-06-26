package codeChefJuneChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//NOT Passed
public class TheTomandJerryGame {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int x = Integer.parseInt(bf.readLine());
            int result = (x & 1) == 0 ? 0 : x / 2;
            System.out.println(result);
        }*/
        int n = 20;
        int x = Integer.lowestOneBit(n);
        System.out.println(x);
        System.out.println(n&((~n) +1));
    }
}
