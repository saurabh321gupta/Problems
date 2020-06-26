package codeChefJuneChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandIcecream {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        mainLoop:
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            int arr[] = new int[16];
            arr[0] = Integer.MAX_VALUE;
            String strNum[] = bf.readLine().split("\\s");
            smallLoop:
            for (String str : strNum) {
                int x = Integer.parseInt(str);
                int change = x - 5;
                if (arr[change]-- == 0) {
                    if (change == 10) {
                        if (arr[5] >= 2) {
                            arr[5] -= 2;
                            continue smallLoop;
                        }
                    }
                    System.out.println("NO");
                    continue mainLoop;
                }
                arr[x]++;
            }
            System.out.println("YES");
        }
    }
}
