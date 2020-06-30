import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FREQUENT {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strNum[] = bf.readLine().split("\\s");
        int n = Integer.parseInt(strNum[0]);
        while (n != 0) {
            int q = Integer.parseInt(strNum[1]);
            strNum = bf.readLine().split("\\s");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strNum[i]);
            }

            Container[] tree = new Container[(4 * n) + 1];
            createTree(tree, arr);

            while (q-- > 0) {
                strNum = bf.readLine().split("\\s");
                int l = Integer.parseInt(strNum[0]);
                int r = Integer.parseInt(strNum[1]);

                Container c = findMax(tree, 0, n - 1, l - 1, r - 1, 1);
                System.out.println(c.maxFreq);
            }
            strNum = bf.readLine().split("\\s");
            n = Integer.parseInt(strNum[0]);
        }
    }

    private static Container findMax(Container[] tree, int start, int end, int from, int to, int index) {
        //No overlap
        if (from > end || to < start) {
            return new Container();
        }

        //complete overlap
        if (from <= start && to >= end) {
            return tree[index];
        }

        int mid = (start + end) / 2;
        int twiceIndex = 2 * index;
        Container left = findMax(tree, start, mid, from, to, twiceIndex);
        Container right = findMax(tree, mid + 1, end, from, to, twiceIndex + 1);

        return merge(left, right);
    }

    private static void createTree(Container[] tree, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int index = 1;
        buildTree(tree, arr, start, end, index);
    }

    private static void buildTree(Container[] tree, int[] arr, int start, int end, int index) {
        if (start == end) {
            tree[index] = new Container(arr[start], arr[start], 1, 1, 1);
            return;
        }

        int mid = (start + end) / 2;
        int twiceIndex = index * 2;

        buildTree(tree, arr, start, mid, twiceIndex);
        buildTree(tree, arr, mid + 1, end, twiceIndex + 1);

        Container left = tree[twiceIndex];
        Container right = tree[twiceIndex + 1];
        tree[index] = merge(left, right);
    }

    private static Container merge(Container left, Container right) {
        //prepare maxFreq
        int maxFreq = Math.max(left.maxFreq, right.maxFreq);
        if (left.suffix == right.prefix) {
            int sum = left.suffixFreq + right.prefixFreq;
            maxFreq = Math.max(sum, maxFreq);
        }

        //prepare prefix
        int prefix = left.prefix;
        int prefixFreq = left.prefixFreq;
        if (left.prefix == right.prefix) {
            prefixFreq += right.prefixFreq;
        }

        //prepare suffix
        int suffix = right.suffix;
        int suffixFreq = right.suffixFreq;
        if (left.suffix == right.suffix) {
            suffixFreq += left.suffixFreq;
        }

        return new Container(prefix, suffix, prefixFreq, suffixFreq, maxFreq);
    }


}

class Container {
    int prefix;
    int suffix;
    int prefixFreq;
    int suffixFreq;
    int maxFreq;

    public Container(int prefix, int suffix, int prefixFreq, int suffixFreq, int maxFreq) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.prefixFreq = prefixFreq;
        this.suffixFreq = suffixFreq;
        this.maxFreq = maxFreq;
    }

    public Container() {
        this.prefix = 1000000;
        this.suffix = 1000000;
        this.prefixFreq = 0;
        this.suffixFreq = 0;
        this.maxFreq = 0;
    }
}