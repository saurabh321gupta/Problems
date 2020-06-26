import java.util.Arrays;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, -2, 4, 5};
        int mapping[] = new int[arr.length];
        int[] tree = buildTree(arr, mapping);
        int qs = 4;
        int qe = 5;
        System.out.println(queryTree(tree, qs, qe));
        int indexToBeUpdated = 4;
        int newValue = 9;
        updateTree(tree, indexToBeUpdated, newValue, mapping);
        System.out.println(queryTree(tree, qs, qe));
    }

    private static void updateTree(int[] tree, int indexToBeUpdated, int newValue, int[] mapping) {
        int indexOfElementInTree = mapping[indexToBeUpdated];
        tree[indexOfElementInTree] = newValue;
        int parentIndex = indexOfElementInTree/2;
        updateParent(tree, parentIndex);
    }

    private static void updateParent(int[] tree, int parentIndex) {
        //base case
        if(parentIndex <=0){
            return;
        }

        int child1 = tree[2*parentIndex];
        int child2 = tree[2*parentIndex+1];
        tree[parentIndex] = Math.min(child1,child2);

        updateParent(tree, parentIndex/2);
    }

    private static int[] buildTree(int[] arr, int[] mapping) {
        int n = arr.length;
        int size = 4 * n + 1;
        int tree[] = new int[size];
        buildTree(tree, 1, 0, n - 1, arr, mapping);
        return tree;
    }

    private static int queryTree(int[] tree, int qs, int qe) {
        return queryTree(tree, 1, 0, (tree.length / 4) - 1, qs, qe);
    }

    private static int queryTree(int[] tree, int index, int start, int end, int qs, int qe) {

        //1. if complete overlap is there
        if (qs <= start && qe >= end) {
            return tree[index];
        }

        //2. if No overlap is there
        if (qs > end || qe < start) {
            return Integer.MAX_VALUE;
        }

        //3. if partial overlap is there
        int mid = (start + end) / 2;
        return Math.min(queryTree(tree, 2 * index, start, mid, qs, qe), queryTree(tree, 2 * index + 1, mid + 1, end, qs, qe));
    }

    private static void buildTree(int[] tree, int index, int start, int end, int[] arr, int[] mapping) {

        if (start == end) {
            tree[index] = arr[start];
            mapping[start] = index;
            return;
        }

        int mid = (start + end) / 2;
        buildTree(tree, 2 * index, start, mid, arr, mapping);
        buildTree(tree, 2 * index + 1, mid + 1, end, arr, mapping);

        int left = tree[2 * index];
        int right = tree[2 * index + 1];

        tree[index] = Math.min(left, right);
    }

}
