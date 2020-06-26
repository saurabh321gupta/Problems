package codeChefJuneChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandString {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            char[] arr = bf.readLine().toCharArray();
            int required = 'x' + 'y';
            int current = 0;
            int previous = 0;
            int count = 0;
            for (char x : arr) {
                current = x;
                if (current + previous == required) {
                    count++;
                    previous = 0;
                } else {
                    previous = current;
                }
            }
            System.out.println(count);
        }
    }
}
