import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//passed
public class AliceLuckyTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String str = bf.readLine();
            int[] arr = new int[6];

            arr[0] = Character.getNumericValue(str.charAt(0));
            arr[1] = Character.getNumericValue(str.charAt(1));

            arr[2] = Character.getNumericValue(str.charAt(3));
            arr[3] = Character.getNumericValue(str.charAt(4));

            arr[4] = Character.getNumericValue(str.charAt(6));
            arr[5] = Character.getNumericValue(str.charAt(7));

            int limit[] = {3, 4, 6, 10, 6, 10};
            int usage[] = {-1, -1, -1, -1, -1, -1};

            for (int i = 0; i < 6; i++) {
                int x = arr[i];
                if (!usageContains(usage, x)) {
                    usage[i] = x;
                } else {
                    if (i == 0 || i == 1) {
                        int h = (arr[0] * 10) + arr[1];
                        if (++h < 24) {
                            if (h == 11 || h == 22) {
                                h++;
                            }
                            arr[1] = usage[1] = h % 10;
                            arr[0] = usage[0] = h / 10;
                        } else {
                            arr[1] = usage[1] = 1;
                            arr[0] = usage[0] = 0;
                        }
                        for (int o = 2; o < 6; o++) {
                            arr[o] = 0;
                        }
                        i = 1;
                        continue;
                    }
                    int l = limit[i];
                    while (usageContains(usage, ++x)) {
                        continue;
                    }
                    for (int k = i + 1; k < 6; k++) {
                        arr[k] = 0;
                    }
                    if (x < l) {
                        usage[i] = x;
                        arr[i] = x;
                    } else {
                        usage[i] = -1;
                        arr[i] = 0;
                        if (i == 0) {
                            i--;
                        } else {
                            i -= 2;
                        }
                        continue;
                    }
                }
            }
            System.out.print(arr[0] + "" + arr[1] + ":" + arr[2] + "" + arr[3] + ":" + arr[4] + "" + arr[5]);
            System.out.println();
        }
    }

    private static boolean usageContains(int[] usage, int x) {
        for (int y : usage) {
            if (y == x)
                return true;
        }
        return false;
    }
}
