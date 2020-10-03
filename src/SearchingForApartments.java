import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SearchingForApartments {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String strNum[] = bf.readLine().split("\\s");
        int arr[] = new int[n];
        int pos = 0;
        int prev = Integer.parseInt(strNum[0]);
        for(int i=1;i<n;i++){
            int curr = Integer.parseInt(strNum[i]);
            if((curr>0&&prev>0) || (curr<0&&prev<0)){
                prev = curr + prev;
                arr[pos]=prev;
            }else{
                prev = curr;
                arr[++pos] = prev;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
