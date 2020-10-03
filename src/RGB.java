import java.io.IOException;
import java.util.Arrays;

public class RGB {
	public static void main(String[] args) throws IOException {
		char arr[] = {'G', 'B', 'R', 'R', 'B', 'R', 'G','R','R'};

		int r = 0;
		int b = arr.length - 1;

		int g = -1;
		int g2 = -1;

		while (r <= b) {

			if (arr[r] == 'B' && arr[b] == 'R') {
				arr[r] = 'R';
				arr[b] = 'B';
			}
			if (arr[r] == 'R') {
				if (g != -1) {
					arr[g] = 'R';
					arr[r] = 'G';
					g++;
				}
				r++;
			} else {
				if (arr[r] == 'G') {
					if (g == -1) {
						g = r;
					}
					r++;
				}
			}

			if (arr[b] == 'B') {
				if (g2 != -1) {
					arr[g2] = 'B';
					arr[b] = 'G';
					g2--;
				}
				b--;
			} else {
				if (arr[b] == 'G') {
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
