import java.io.*;

//Passed on SPOJ
public class KGSS {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int strNum[] = new int[n];
        for (int i = 0; i < n; i++) {
            strNum[i] = r.nextInt();
        }
        int m = r.nextInt();
        Node2 tree[] = buildTree(strNum);
        StringBuilder sb = new StringBuilder();
        while (m > 0) {
            char o = r.nextChar();
            int x = r.nextInt();
            int y = r.nextInt();
            if (o == 'Q') {
                sb.append(queryTree(tree, x - 1, y - 1, n - 1, strNum) + "\n");
            } else {
                updateTree(tree, 1, 0, n - 1, x - 1, y);
            }
            m--;
        }
        System.out.println(sb);
    }

    private static Node2 updateTree(Node2[] tree, int index, int start, int end, int position, int value) {

        if (start == end && start == position) {
            tree[index].max1 = value;
            return tree[index];
        }
        if (start > position || end < position) {
            return tree[index];
        }
        int mul = 2 * index;
        int mid = (start + end) / 2;
        tree[index] = merge(updateTree(tree, mul, start, mid, position, value), updateTree(tree, mul + 1, mid + 1, end, position, value));
        return tree[index];
    }

    private static int queryTree(Node2[] tree, int x, int y, int end, int[] strNum) {
        Node2 node = queryTree(tree, 1, 0, end, x, y);
        return node.max1 + node.max2;
    }

    private static Node2 queryTree(Node2[] tree, int index, int start, int end, int x, int y) {

        //Complete overlap
        if (x <= start && y >= end) {
            return tree[index];
        }

        //No overlap
        if (start > y || end < x) {
            return new Node2(Integer.MIN_VALUE, Integer.MIN_VALUE, -1, -1);
        }

        int mid = (start + end) / 2;

        int mul = 2 * index;
        //partial overlap
        Node2 left = queryTree(tree, mul, start, mid, x, y);

        Node2 right = queryTree(tree, mul + 1, mid + 1, end, x, y);

        Node2 node = merge(left, right);
        return node;
    }

    private static Node2[] buildTree(int[] strNum) {
        int n = strNum.length;
        int size = 4 * n + 1;
        Node2[] tree = new Node2[size];
        int index = 1;
        int start = 0;
        int end = n - 1;
        buildTree(tree, strNum, index, start, end);
        return tree;
    }

    private static void buildTree(Node2[] tree, int[] strNum, int index, int start, int end) {
        //Base case
        if (start == end) {
            //int x = Integer.parseInt(strNum[start]);
            int x = strNum[start];
            tree[index] = new Node2(x, Integer.MIN_VALUE, start, -1);
            return;
        }
        int mid = (start + end) / 2;
        buildTree(tree, strNum, 2 * index, start, mid);
        buildTree(tree, strNum, 2 * index + 1, mid + 1, end);

        Node2 left = tree[2 * index];
        Node2 right = tree[2 * index + 1];

        Node2 node = merge(left, right);
        tree[index] = node;
    }

    private static Node2 merge(Node2 left, Node2 right) {
        int i1 = -1;
        int i2 = -1;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        if (left.max1 > max) {
            max = left.max1;
            i1 = left.i1;
        }
        if (left.max2 > max) {
            max = left.max2;
            i1 = left.i2;
        }
        if (right.max1 > max) {
            max = right.max1;
            i1 = right.i1;
        }
        if (right.max2 > max) {
            max = right.max2;
            i1 = right.i2;
        }
        if (left.max1 > max2 && left.i1 != i1) {
            max2 = left.max1;
            i2 = left.i1;
        }
        if (left.max2 > max2 && left.i2 != i1) {
            max2 = left.max2;
            i2 = left.i2;
        }
        if (right.max1 > max2 && right.i1 != i1) {
            max2 = right.max1;
            i2 = right.i1;
        }
        if (right.max2 > max2 && right.i2 != i1) {
            max2 = right.max2;
            i2 = right.i2;
        }
        return new Node2(max, max2, i1, i2);
    }
}

class Node2 {
    int max1;
    int max2;
    int i1;
    int i2;

    public Node2(int max1, int max2, int i1, int i2) {
        this.max1 = max1;
        this.max2 = max2;
        this.i1 = i1;
        this.i2 = i2;
    }
}
