import java.io.*;

//Passed on SPOJ
public class GSS1 {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int strNum[] = new int[n];
        for (int i = 0; i < n; i++) {
            strNum[i] = r.nextInt();
        }
        int m = r.nextInt();
        Node tree[] = buildTree(strNum);
        StringBuilder sb = new StringBuilder();
        while (m > 0) {
            int x = r.nextInt() - 1;
            int y = r.nextInt() - 1;
            sb.append(queryTree(tree, x, y, n - 1) + "\n");
            m--;
        }
        System.out.println(sb);
    }

    private static int queryTree(Node[] tree, int x, int y, int end) {
        return queryTree(tree, 1, 0, end, x, y).maxSubArray;
    }

    private static Node queryTree(Node[] tree, int index, int start, int end, int x, int y) {

        //Complete overlap
        if (x <= start && y >= end) {
            return tree[index];
        }

        //No overlap
        if (start > y || end < x) {
            return new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }

        int mid = (start + end) / 2;

        int mul = 2 * index;
        //partial overlap
        Node left = queryTree(tree, mul, start, mid, x, y);

        Node right = queryTree(tree, mul + 1, mid + 1, end, x, y);

        Node node = merge(left, right);
        return node;
    }

    private static Node[] buildTree(int[] strNum) {
        int n = strNum.length;
        int size = 4 * n + 1;
        Node[] tree = new Node[size];
        int index = 1;
        int start = 0;
        int end = n - 1;
        buildTree(tree, strNum, index, start, end);
        return tree;
    }

    private static void buildTree(Node[] tree, int[] strNum, int index, int start, int end) {
        //Base case
        if (start == end) {
            //int x = Integer.parseInt(strNum[start]);
            int x = strNum[start];
            tree[index] = new Node(x, x, x, x);
            return;
        }
        int mid = (start + end) / 2;
        buildTree(tree, strNum, 2 * index, start, mid);
        buildTree(tree, strNum, 2 * index + 1, mid + 1, end);

        Node left = tree[2 * index];
        Node right = tree[2 * index + 1];

        Node node = merge(left, right);
        tree[index] = node;
    }

    private static Node merge(Node left, Node right) {

        //preparing prefixMax
        //cases
        //Max((prefix of left node) , (sum of leftNode + prefix of right node )
        int prefixMax = Math.max(left.prefixMax, safeSum(left.sum, right.prefixMax));

        //preparing suffixMax
        //cases
        //Max((suffix of left node + sum of right node), (suffix of right node))
        int suffixMax = Math.max(safeSum(left.suffixMax, right.sum), right.suffixMax);

        //preparing maxSubArray
        //cases
        //Max((suffix of left node + prefix of right node), (prefix of leftNode), (suffix of leftNode), (prefix of rightNode), (suffix of rightNode))
        int maxSubArray = max(safeSum(left.suffixMax, right.prefixMax), left.prefixMax, left.suffixMax, right.prefixMax, right.suffixMax, left.maxSubArray, right.maxSubArray);

        int sum = safeSum(left.sum, right.sum);

        return new Node(sum, prefixMax, suffixMax, maxSubArray);
    }

    public static int safeSum(int a, int b) {
        if (a == Integer.MIN_VALUE || b == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return a + b;
    }

    public static int max(int... arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}


class Node {
    int sum;
    int prefixMax;
    int suffixMax;
    int maxSubArray;

    public Node(int sum, int prefixSum, int suffixSum, int maxSubArray) {
        this.sum = sum;
        this.prefixMax = prefixSum;
        this.suffixMax = suffixSum;
        this.maxSubArray = maxSubArray;
    }
}


class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public char nextChar() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        char result = (char) (c & 0xFF);
        return result;
    }

}