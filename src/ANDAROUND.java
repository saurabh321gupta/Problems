import java.io.*;

//Passed on SPOJ
public class ANDAROUND {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int t = r.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = r.nextInt();
            int k = r.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = r.nextInt();
            }
            int size = 4 * n + 1;
            int tree[] = new int[size];
            int start = 0;
            int end = n - 1;
            int index = 1;
            buildTree(tree, arr, index, start, end);
            sb.append(query(tree, k, n) + "\n");
        }
        System.out.println(sb);
    }

    private static String query(int[] tree, int k, int n) {
        if (k > n / 2) {
            k = n / 2;
        }
        StringBuilder sb = new StringBuilder();
        //first part
        for (int i = 0; i < k; i++) {
            int end1 = i + k;
            int start1 = 0;

            int start2 = n + i - k;
            int end2 = n - 1;
            int result1 = query(tree, 1, 0, n - 1, start1, end1);
            int result2 = query(tree, 1, 0, n - 1, start2, end2);
            sb.append((result1 & result2) + " ");
        }

        //second part
        for (int i = k; i < (n - k); i++) {
            int start = i - k;
            int end = i + k;

            int result = query(tree, 1, 0, n - 1, start, end);
            sb.append((result) + " ");
        }

        //third part
        for (int i = n - k; i < n; i++) {
            int start1 = i - k;
            int end1 = n - 1;

            int start2 = 0;
            int end2 = (i + k) - n;

            int result1 = query(tree, 1, 0, n - 1, start1, end1);
            int result2 = query(tree, 1, 0, n - 1, start2, end2);
            sb.append((result1 & result2) + " ");
        }
        return sb.toString().trim();
    }

    private static int query(int[] tree, int index, int start, int end, int x, int y) {

        //complete overlap
        if (x <= start && y >= end) {
            return tree[index];
        }

        //No overlap
        if (start > y || end < x) {
            return -1;
        }

        int mul = 2 * index;
        int mid = (start + end) / 2;
        int left = query(tree, mul, start, mid, x, y);
        int right = query(tree, mul + 1, mid + 1, end, x, y);

        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return left & right;
    }

    private static void buildTree(int[] tree, int[] arr, int index, int start, int end) {
        if (start == end) {
            tree[index] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        int mul = 2 * index;
        buildTree(tree, arr, mul, start, mid);
        buildTree(tree, arr, mul + 1, mid + 1, end);

        tree[index] = tree[mul] & tree[mul + 1];
    }
}