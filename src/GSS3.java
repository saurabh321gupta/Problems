import java.io.*;

//Passed on SPOJ
public class GSS3 {
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
            int o = r.nextInt();
            int x = r.nextInt();
            int y = r.nextInt();
            if (o == 1) {
                sb.append(queryTree(tree, x - 1, y - 1, n - 1) + "\n");
            } else {
                updateTree(tree, 1, 0, n - 1, x - 1, y);
            }
            m--;
        }
        System.out.println(sb);
    }

    private static Node updateTree(Node[] tree, int index, int start, int end, int position, int value) {

        if (start == end && start == position) {
            tree[index].sum = tree[index].prefixMax = tree[index].suffixMax = tree[index].maxSubArray = value;
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
