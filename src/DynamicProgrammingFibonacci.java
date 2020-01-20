import java.util.Scanner;


public class DynamicProgrammingFibonacci {
    //Dynamic Programming Fibonacci
    public static void main(String[] args) {
        int x[] = new int[199];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        if (n >= 1) {
            System.out.println(1);
            n--;
        }
        while (n > 0) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println(next);
            n--;
            System.out.println();
        }
    }
}
