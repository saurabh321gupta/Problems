import java.io.IOException;

//using plain recursion
public class KnapSack {
	public static void main(String[] args) throws IOException {

		int value[] = {3, 2, 7};
		int weight[] = {4, 7, 2};

		int W = 4;
		int m = value.length - 1;
		System.out.println(findMaxValue(value, weight, m, W, 0));

	}

	private static int findMaxValue(int[] value, int[] weight, int m, int W, int V) {
		if (m < 0||W==0)
			return V;

		if (W < weight[m]) {
			return findMaxValue(value, weight, m - 1, W, V);
		} else {
			return Math.max(findMaxValue(value, weight, m - 1, W - weight[m], V + value[m]),
					findMaxValue(value, weight, m - 1, W, V));
		}

	}
}
