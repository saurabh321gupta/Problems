import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program2 {

	/*
	 * collections
	 * 
	 * employees.stream().filter(x->x.getMobileNumber==null).forEach(x->x.getFName()
	 * .toUpperCase())collect(Collectors.toList());
	 */
	// 0 1 1 2 3 5
	public static void main(String[] args) throws IOException {
		int prev = 0;
		int curr = 1;
		int next;
		int n = 10;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				System.out.println(i);
				continue;
			}
			next = curr + prev;
			System.out.println(next);
			prev = curr;
			curr = next;
		}
	}
}
