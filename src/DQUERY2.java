import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DQUERY2 {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt();
        }
        int q = r.nextInt();
        Set[] tree = new Set[4 * n + 1];
        buildTree(tree, arr, 1, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int x = r.nextInt() - 1;
            int y = r.nextInt() - 1;

            sb.append(queryTree(tree, 1, 0, n - 1, x, y).size() + "\n");
        }
        System.out.println(sb);
    }

    private static Set queryTree(Set[] tree, int index, int start, int end, int x, int y) {
        //complete overlap
        if (x <= start && end <= y) {
            return tree[index];
        }

        //No overlap
        if (start > y || end < x) {
            return Collections.EMPTY_SET;
        }

        int mid = (start + end) / 2;
        int mul = 2 * index;
        Set<Integer> left = queryTree(tree, mul, start, mid, x, y);
        Set<Integer> right = queryTree(tree, mul + 1, mid + 1, end, x, y);

        return merge(left, right);
    }

    private static Set buildTree(Set[] tree, int[] arr, int index, int start, int end) {

        if (start == end) {
            tree[index] = new HashSet(1) {{
                add(arr[start]);
            }};
            return tree[index];
        }

        int mid = (start + end) / 2;
        int mul = 2 * index;
        Set left = buildTree(tree, arr, mul, start, mid);
        Set right = buildTree(tree, arr, mul + 1, mid + 1, end);

        tree[index] = merge(left, right);
        return tree[index];
    }

    private static Set merge(Set left, Set right) {
        Set<Integer> result = new HashSet<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
