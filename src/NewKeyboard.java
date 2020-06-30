import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewKeyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringBuffer forward = new StringBuffer();
        StringBuffer backward = new StringBuffer();
        StringBuffer activeBuffer = forward;
        boolean numeric = true;
        for (char x : str.toCharArray()) {
            if (x == '<') {
                forward = backward.append(forward);
                backward = new StringBuffer();
                activeBuffer = backward;
            } else if (x == '>') {
                forward = backward.append(forward);
                activeBuffer = forward;
                backward = new StringBuffer();
            } else if (x == '*') {
                if (activeBuffer.length() != 0)
                    activeBuffer.deleteCharAt(activeBuffer.length() - 1);
            } else if (x == '#') {
                numeric = !numeric;
            } else if (x >= '0' && x <= '9') {
                if (numeric) {
                    activeBuffer.append(x);
                }
            } else {
                activeBuffer.append(x);
            }
        }
        System.out.println(backward + "" + forward);
    }
}
