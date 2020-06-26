import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DQUERYUSINGBIT {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        Set tree[] = new Set[n + 1];
        for (int i=1;i<=n;i++){
            tree[i]=new HashSet();
        }

        for (int i = 0; i < n; i++) {
            int x = r.nextInt();
            //update
            int index = i + 1;
            while (index <= n) {
                tree[index].add(x);
                index += Integer.lowestOneBit(index);
            }
        }

        int q = r.nextInt();
        while (q-- > 0) {
            int x = r.nextInt();
            int y = r.nextInt();
            System.out.println(getElementCount(tree, y) - getElementCount(tree, x - 1));

        }

    }

    private static int getElementCount(Set[] tree, int x) {
        Set<Integer> set = new HashSet<>();
        int index = x;
        while (index > 0) {
            set.addAll(tree[index]);
            index = index - Integer.lowestOneBit(index);
        }
        return set.size();
    }
}