import java.io.IOException;

public class MyProgram {
    public static void main(String[] args) throws IOException {
        char[] arr = "dog".toCharArray();
        int n = arr.length;
        for(int x=0;x<n;x++){
            String str = "";
            for(int i=x;i<n;i++){
                str = str+ arr[i];
                System.out.println(str);
            }
        }

    }
}


       // write a function which give Output: ["d", "do", "dog", "o", "og", "g"] for passing string argument "dog"


