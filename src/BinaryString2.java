import java.io.IOException;

public class BinaryString2 {
    public static void main(String[] args) throws IOException {
        System.out.println(addBinary("1001", "1000"));
    }

    static String addBinary(String a, String b) {

        int count = 0;
        String answer = "";

        int x = a.length() - 1;
        int y = b.length() - 1;

        while (x >= 0 || y >= 0 || count == 1) {

            count = count + ((x >= 0) ? a.charAt(x) - '0' : 0);
            count = count + ((y >= 0) ? b.charAt(y) - '0' : 0);

            answer = (char) (count % 2 + '0') + answer;
            count = count / 2;

            x--;
            y--;
        }
        return answer;
    }
}
