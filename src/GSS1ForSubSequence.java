import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//MaximumSubSequence
public class GSS1ForSubSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        while(str==null || str.isEmpty()){
            str = bf.readLine();
        }
        int n = Integer.parseInt(str);
        String strNum[] = bf.readLine().split("\\s");
        int tree[] = buildTree(strNum);
        int m = Integer.parseInt(bf.readLine());
        while (m > 0) {
            strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]) - 1;
            int y = Integer.parseInt(strNum[1]) - 1;
            System.out.println(queryTree(tree, x, y));
            m--;
        }
    }

    private static int queryTree(int[] tree, int x, int y) {
        return queryTree(tree, 1, 0, (tree.length / 4) - 1, x, y);
    }

    private static int queryTree(int[] tree, int index, int start, int end, int x, int y) {

        //No overlap
        if (x > end || y < start) {
            return Integer.MIN_VALUE;
        }

        //complete overlap
        if (x <= start && y >= end) {
            return tree[index];
        }

        //partial overlap
        int mid = (start + end) / 2;
        int left = queryTree(tree, 2 * index, start, mid, x, y);
        int right = queryTree(tree, 2 * index + 1, mid + 1, end, x, y);
        int result;
        if (left > 0 && right > 0) {
            result = left + right;
        } else {
            result = left > right ? left : right;
        }
        return result;
    }

    private static int[] buildTree(String[] strNum) {
        int n = strNum.length;
        int size = 4 * n + 1;
        int tree[] = new int[size];
        int index = 1;
        int start = 0;
        int end = n - 1;
        buildTree(tree, index, start, end, strNum);
        return tree;
    }

    private static void buildTree(int[] tree, int index, int start, int end, String[] strNum) {

        if (start == end) {
            tree[index] = Integer.parseInt(strNum[start]);
            return;
        }

        int mid = (start + end) / 2;
        buildTree(tree, 2 * index, start, mid, strNum);
        buildTree(tree, 2 * index + 1, mid + 1, end, strNum);

        int left = tree[2 * index];
        int right = tree[2 * index + 1];

        int result;
        if (left > 0 && right > 0) {
            result = left + right;
        } else {
            result = left > right ? left : right;
        }
        tree[index] = result;
    }


}
