import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String x = listIterator.next();
			if (x.equals("c")) {
                listIterator.remove();

                listIterator.add("k");
                listIterator.add("l");
                listIterator.add("m");


                listIterator.previous();
                listIterator.previous();
                listIterator.previous();
			}
			System.out.println(x);
		}
	}
}
