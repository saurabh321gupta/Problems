import java.io.IOException;

public class SpiderMove {
    public static void main(String[] args) throws IOException {
        System.out.println(countPaths(2, -2));
    }

    static int countPaths(int n, int m) {
        // If we reach bottom or top left, we are
        // have only one way to reach (0, 0)
        if (n == 0 || m == 0)
            return 1;

        // Else count sum of both ways
        if (n > 0) {
            n--;
        } else if (n < 0) {
            n++;
        }

        if (m > 0) {
            m--;
        } else if (m < 0) {
            m++;
        }
        return (countPaths(n, m) + countPaths(n, m - 1));
    }
}
