import java.io.IOException;

public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        System.out.println(addTwoDigits(29));
    }

    static int addTwoDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

}
