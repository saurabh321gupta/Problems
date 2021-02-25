import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strNum[] = bf.readLine().split("\\s");
		int m = Integer.parseInt(strNum[0]);
		int n = Integer.parseInt(strNum[1]);
		Map<String, Character> directionMovement = new HashMap() {
			{
				put("NL", 'W');
				put("WL", 'S');
				put("SL", 'E');
				put("EL", 'N');
				put("NR", 'E');
				put("WR", 'N');
				put("SR", 'W');
				put("ER", 'S');
			}
		};
		String input = bf.readLine();
		StringBuilder result = new StringBuilder("");
		while (input != null && !input.isEmpty()) {
			strNum = input.split("\\s");
			int x = Integer.parseInt(strNum[0]);
			int y = Integer.parseInt(strNum[1]);
			char direction = strNum[2].charAt(0);
			char[] instructions = bf.readLine().toCharArray();
			for (char i : instructions) {
				if (i == 'M') {
					switch (direction) {
						case 'N' :
							y++;
							break;

						case 'E' :
							x++;
							break;

						case 'S' :
							y--;
							break;

						case 'W' :
							x--;
							break;
					}
				} else {
					direction = directionMovement.get("" + direction + "" + i);
				}
			}
			result.append("" + x + " " + y + " " + direction + "\n");
			input = bf.readLine();
		}
		System.out.println(result);
	}
}
