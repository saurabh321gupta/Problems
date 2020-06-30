import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NewKeyboardUsingStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            char[] arr = bf.readLine().toCharArray();
            Stack<Character> forward = new Stack<>();
            Stack<Character> backward = new Stack<>();
            Stack<Character> activeBuffer = forward;
            boolean numeric = true;
            for (char x : arr) {
                if (x == '<') {
                    if (!backward.isEmpty()) {
                        Stack<Character> tempStack = new Stack<>();
                        while (!forward.isEmpty()) {
                            tempStack.push(forward.pop());
                        }
                        while (!tempStack.isEmpty()) {
                            backward.push(tempStack.pop());
                        }
                        activeBuffer = backward;
                        backward = forward;
                        forward = activeBuffer;

                    }
                    activeBuffer = backward;
                } else if (x == '>') {
                    Stack<Character> tempStack = new Stack<>();
                    while (!forward.isEmpty()) {
                        tempStack.push(forward.pop());
                    }
                    while (!tempStack.isEmpty()) {
                        backward.push(tempStack.pop());
                    }
                    activeBuffer = backward;
                    backward = forward;
                    forward = activeBuffer;
                } else if (x == '*') {
                    if (!activeBuffer.isEmpty())
                        activeBuffer.pop();
                } else if (x == '#') {
                    numeric = !numeric;
                } else if (x >= '0' && x <= '9') {
                    if (numeric) {
                        activeBuffer.push(x);
                    }
                } else {
                    activeBuffer.push(x);
                }
            }
            Stack<Character> tempStack = new Stack<>();
            while (!forward.isEmpty()) {
                tempStack.push(forward.pop());
            }
            while (!tempStack.isEmpty()) {
                backward.push(tempStack.pop());
            }
            while (!backward.isEmpty()) {
                tempStack.push(backward.pop());
            }
            while (!tempStack.isEmpty()) {
                System.out.print(tempStack.pop());
            }
            System.out.println();
        }
    }
}
