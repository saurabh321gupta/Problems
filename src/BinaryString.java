import java.io.IOException;

public class BinaryString {
    public static void main(String[] args) throws IOException {
        System.out.println(addBinaryStrings("1000", "1111"));
    }

    static String addBinaryStrings(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        //TODO: remove leading zeros also
        int n = Math.max(a.length(), b.length());
        int result[] = new int[n];

        char carry = '0';
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        while (i >= 0 && j >= 0) {
            char sum = sum(arr1[i],carry);
            //char carry =
        }


        return null;
    }

    static char sum(char a, char b) {
        if (a == '0') {
            if (b == '0') {
                return '0';
            } else {
                return '1';
            }
        } else {
            if (b == '0') {
                return '1';
            } else {
                return '0';
            }
        }
    }

    static char getCarry(char a, char b) {
        if (a == '1' && b == '1') {
            return '1';
        }
        return '0';
    }
}
