import java.io.IOException;

public class TOH {

	static int x = 'S' ^ 'D' ^ 'A';
	static int moves = 0;

	public static void main(String[] args) throws IOException {
		int n = 2;
		move(n, 'S', 'D');
		System.out.println("TOTAL MOVES REQUIRED: " + moves);
	}

	private static void move(int n, char source, char destination) {
		if (n == 1) {
			System.out.println(source + " -> " + destination);
			moves++;
			return;
		}
		char aux = getAux(source, destination);
		move(n - 1, source, aux);
		move(1, source, destination);
		move(n - 1, aux, destination);
	}

	private static char getAux(char source, char destination) {
		return (char) (x ^ source ^ destination);
	}
}
