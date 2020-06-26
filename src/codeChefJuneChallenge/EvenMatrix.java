package codeChefJuneChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            if (n == 1) {
                System.out.println("1");
                continue;
            }
            int odd = 1;
            int even = 2;
            boolean isOdd = true;
            for (int i = 0; i < n; i++) {
                int j = 0;
                if (isOdd) {
                    for (; j < n / 2; j++) {
                        System.out.print(odd + " " + even + " ");
                        odd += 2;
                        even += 2;
                    }
                    if ((n & 1) != 0) {
                        System.out.print(odd);
                        odd += 2;
                    }
                    System.out.println();
                } else {
                    for (; j < n / 2; j++) {
                        System.out.print(even + " " + odd + " ");
                        odd += 2;
                        even += 2;
                    }
                    if ((n & 1) != 0) {
                        System.out.print(even);
                        even += 2;
                    }
                    System.out.println();
                }
                isOdd = !isOdd;
            }

        }
    }
}
