import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NewKeyboardUsingStack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = bf.readLine().toCharArray();
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        Stack<Character> active = a;
        boolean numeric = true;
        for (char x : arr) {
            switch (x) {
                case '<': {
                    if (!b.isEmpty()) {
                        Stack<Character> temp = new Stack<>();
                        while (!a.isEmpty()) {
                            temp.push(a.pop());
                        }
                        while (!temp.isEmpty()) {
                            b.push(temp.pop());
                        }
                        a = b;
                        b = new Stack<>();
                    }
                    active = b;
                }
                break;
                case '>': {
                    if (!b.isEmpty()) {
                        Stack<Character> temp = new Stack<>();
                        while (!a.isEmpty()) {
                            temp.push(a.pop());
                        }
                        while (!temp.isEmpty()) {
                            b.push(temp.pop());
                        }
                        a = b;
                        b = new Stack<>();
                    }
                    active = a;
                }
                break;
                case '*': {
                    if (!active.isEmpty())
                        active.pop();
                }
                break;
                case '#': {
                    numeric = !numeric;
                }
                break;
                default: {
                    if (x >= '0' && x <= '9') {
                        if (numeric) {
                            active.push(x);
                        }
                    } else {
                        active.push(x);
                    }
                }
            }
        }
        printStack(b);
        printStack(a);
        System.out.println();
    }

    private static void printStack(Stack<Character> b) {
        Stack<Character> x = new Stack<>();
        while (!b.isEmpty())
            x.push(b.pop());
        while (!x.isEmpty())
            System.out.print(x.pop());
    }
}
