import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//passed
public class JewelGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            char arr[] = bf.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            int count = 0;
            for (char x : arr) {
                if (!stack.isEmpty() && stack.peek() == x) {
                    count++;
                    stack.pop();
                } else {
                    stack.push(x);
                }
            }
            System.out.println(count);
        }
    }
}
