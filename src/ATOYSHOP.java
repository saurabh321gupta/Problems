import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATOYSHOP {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strNum[] = bf.readLine().split("\\s");
		int n = Integer.parseInt(strNum[0]);
		int m = Integer.parseInt(strNum[1]);

		char[] arr = bf.readLine().toCharArray();

		int cost[] = new int[26];

		strNum = bf.readLine().split("\\s");
		for (int i = 0; i < 26; i++) {
			cost[i] = Integer.parseInt(strNum[i]);
		}

		int max = 0;
		/*for(int i=0;i<26;i++){
		    char x = (char)('a' + i);
		    int j = 0;
		    int toysCount = 0;
		    int amount = m;
		    while(j<n){
		        if(arr[j]=='')
		        amount = amount -
            }
        }
*/
	}
}
