import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewKeyboardUsingPointers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = bf.readLine().toCharArray();
        boolean numeric = true;
        Letter s1=null;
        Letter e1=null;
        Letter s2=null;
        Letter e2=null;

        
        for (char x : arr) {
            switch (x) {
                case '<': {
                e1.next = s2;
                s2 = s1;
                s1 = null;
                e1 = null;
                }
                break;
                case '>': {
                }
                break;
                case '*': {
                }
                break;
                case '#': {
                    numeric = !numeric;
                }
                break;
                default: {
                    if (x >= '0' && x <= '9') {
                        if (numeric) {
                        }
                    } else {
                        Letter letter = new Letter(x, null);
                    }
                }
            }
        }
        System.out.println();
    }

}

class Letter {
    char c;
    Letter next;

    public Letter(char c, Letter next) {
        this.next = next;
        this.c = c;
    }
}