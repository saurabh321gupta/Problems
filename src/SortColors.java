import java.io.IOException;
import java.util.Arrays;

public class SortColors {
	public static void main(String[] args) throws IOException {
		int arr[] = {2,0,2,1,1,0};

		int r = 0;
		int b = arr.length - 1;

		int g = -1;
		int g2 = -1;

		while (r <= b) {

			if (arr[r] == 2 && arr[b] == 0) {
				arr[r] = 0;
				arr[b] = 2;
			}
			if (arr[r] == 0) {
				if (g != -1) {
					arr[g] = 0;
					arr[r] = 1;
					g++;
				}
				r++;
			} else {
				if (arr[r] == 1) {
					if (g == -1) {
						g = r;
					}
					r++;
				}
			}

			if (arr[b] == 2) {
				if (g2 != -1) {
					arr[g2] = 2;
					arr[b] = 1;
					g2--;
				}
				b--;
			} else {
				if (arr[b] == 1) {
					if (g2 == -1) {
						g2 = b;
					}
					b--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
