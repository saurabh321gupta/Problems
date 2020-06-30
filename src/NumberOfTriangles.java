import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfTriangles {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int b1 = Integer.parseInt(strNum[1]);
            int b2 = Integer.parseInt(strNum[2]);

            int gap = Math.abs(b1 - b2);
            int excludedEdges = 4;
            if (gap == 1 || gap == n - 1) {
                excludedEdges = 3;
            }
            System.out.println((n - excludedEdges) * (n - 4));
        }
    }
}
