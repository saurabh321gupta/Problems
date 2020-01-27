import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;


public class DPNUmberOfWaysToFormANumber {
    /* public static void main(String[] args) throws IOException {
     *//* BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strNum[] = bf.readLine().split("\\s");
        int arr[] = new int[strNum.length];
        for(int i=0;i<strNum.length;i++){
            arr[i] = Integer.parseInt(strNum[i]);
        }
        int n = Integer.parseInt(bf.readLine());*//*
     *//* BigDecimal left = BigDecimal.valueOf(332200925.7513).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal right = BigDecimal.valueOf(3322009255.751).setScale(2, BigDecimal.ROUND_HALF_UP);

        if(!(left.compareTo(right) >= 0 )){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }*//*

     *//* Double x = 332200925.7513;
        Double y = 332200925.751;
        Double z = 332200925.7517;

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_DOWN);
        for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324,x,y,z)) {
            Double d = n.doubleValue();
            System.out.println(df.format(d));*//*

     //  Double x = 10.3;
      // Long y = 10L;


*//*
        if () {
            throw new ConstraintException(ErrorCode.INVALID_CONSTRAINTS,"Total rule sum(leaf.eff.max) >= tot.eff.min violation"
                    + " (" + formatter.format(sumOfAllLeafMinAndMax.getValue2()) + " >= " + formatter.format(totalConstraintsResult.getEffectiveMin()) + ")");
        }

       Double x = ;
       Double y = 332200925.751*//*

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t>0){
            String arr[] =   bf.readLine().split("\\s");
            String word = arr[0];
            String password = arr[1];
            int index = password.indexOf(word);
            if(index ==-1)
                System.out.println("Impossible");
            else {
                String str = password.substring(0,index)+password.substring(index+word.length(), password.length());
                if(str.equals(word))
                    System.out.println("Possible");
                else
                    System.out.println("Impossible");
            }
            t--;
        }




        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            if(x%2!=0){
                --x;
            }
            x/=2;
            if(x%2!=0){
                System.out.println((x/2)*((x/2)+1));
            }
            else{
                System.out.println(x);
            }

            t--;


    }
     //public Double
}
*/
   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();
        String strNum[] = s.split("\\s");
        int num = 0;
        if (n < 3) {
            System.out.println(num);
            return;
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = Integer.parseInt(strNum[i]);
                    int y = Integer.parseInt(strNum[j]);
                    int z = Integer.parseInt(strNum[k]);
                    num += (x + y + z) / (x * y * z);
                }
            }

        }
        System.out.println(num);
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        String strNum2[];
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            strNum = bf.readLine().split("\\s");
            strNum2 = bf.readLine().split("\\s");
            int arr1[] = new int[101];
            int arr2[] = new int[101];
            for (int i = 0; i < n; i++) {
                arr1[Integer.parseInt(strNum[i])]++;
                arr2[Integer.parseInt(strNum2[i])]++;

            }
            int x = 0;
            int xNum = 0;
            int y = 0;
            int yNum = 0;
            for (int i = 0; i < 101; i++) {
                if (arr1[i] >= xNum) {
                    x = i;
                    xNum = arr1[i];
                }
                if (arr2[i] >= yNum) {
                    y = i;
                    yNum = arr2[i];
                }
            }
            if (x > y) {
                System.out.println("Rupam");
            } else if (x < y) {
                System.out.println("Ankit");
            } else {
                System.out.println("Tie");
            }
            t--;
        }
    }*/

   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        while(t>0){
            strNum = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int k = Integer.parseInt(strNum[1]);

            t--;
        }

    }

    public boolean group(int n, int k){
        int base = n-k;
        if(base<0){
            return false;
        }
        group(base,k);
    }
*/

    /*public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        List<String> arr2 = new ArrayList<>();
        arr2.add("b");
        arr2.add("a");
        System.out.println(arr.equals(arr2));
    }*/

   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t>0){
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            int arr[][] = new int[n+1][n+1];
            while(m>0){
                strNum = bf.readLine().split("\\s");
                int x = Integer.parseInt(strNum[0]);
                int y = Integer.parseInt(strNum[1]);
                ++arr[x][y];
                ++arr[y][x];
                m--;
            }
            t--;
        }
    }

    public boolean isAvailable(int arr[][], int from, int destination) {
        if (arr[from][destination] != 0)
            return true;
        return false;
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String strNum[];
        Map<Integer, Integer> map = new TreeMap<>();
        while(n>0){
            strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]);
            int y = Integer.parseInt(strNum[1]);
            Integer num1 = map.get(x);
            Integer num2 = map.get(y+1);
            if(num1!=null){
                map.put(x,++num1);
            }else{
                map.put(x, 1);
            }

            if(num2!=null){
                map.put(y+1, --num2);
            }else{
                map.put(y+1, -1);
            }
            n--;
        }
        int max =0;
        int value =0;
        for(int x : map.values()){
            value += x;
            if (max < value) {
                max = value;
            }
        }
        System.out.println(max);
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strNum[] = bf.readLine().split("\\s");
        long n = Long.parseLong(strNum[1]);
        Map<Long, Long> map = new TreeMap<>();
        while (n > 0) {
            strNum = bf.readLine().split("\\s");
            long x = Long.parseLong(strNum[0]);
            long y = Long.parseLong(strNum[1]);
            long z = Long.parseLong(strNum[2]);
            Long num1 = map.get(x);
            Long num2 = map.get(y + 1);
            if (num1 != null) {
                map.put(x, num1 + z);
            } else {
                map.put(x, z);
            }

            if (num2 != null) {
                map.put(y + 1, num2 - z);
            } else {
                map.put(y + 1, -z);
            }
            n--;
        }
        long max = 0;
        long value = 0;
        for (long x : map.values()) {
            value += x;
            if (max < value) {
                max = value;
            }
        }
        System.out.println(max);
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String word = bf.readLine();

        String strNum[];
        mainLoop:
        while(t>0){
            strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]);
            int y = Integer.parseInt(strNum[1]);
            String str = word.substring(x-1, y);
            int arr[] = new int[26];
            for(char i : str.toCharArray()){
                ++arr[i-97];
            }
            boolean flag = false;
            for(int i=0;i<26;i++){
                if((arr[i]&1)!=0){
                    if(flag){
                        System.out.println("Impossible");
                        continue mainLoop;
                    }else {
                        flag=true;
                    }
                }
            }
            System.out.println("Possible");
        }
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String word = bf.readLine();
        int arr[][] = new int[word.length() + 1][26];
        for (int i = 1; i <= word.length(); i++) {
            char x = word.charAt(i - 1);
            arr[i][x - 97]++;
        }
        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < 26; j++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
        String strNum[];
        mainLoop:
        while (t > 0) {
            strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]);
            int y = Integer.parseInt(strNum[1]);
            boolean flag = false;
            for (int i = 0; i < 26; i++) {
                int a = arr[x - 1][i];
                int b = arr[y][i];
                if (((b - a) & 1) != 0) {
                    if (flag) {
                        System.out.println("Impossible");
                        t--;
                        continue mainLoop;
                    } else {
                        flag = true;
                    }
                }
            }
            System.out.println("Possible");
            t--;
        }
    }*/
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        while(t>0){
            strNum = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int k = Integer.parseInt(strNum[1]);
            String str = bf.readLine();
            str+=str;
            int arr[] = new int[k];
            int max =0;
            int occurence=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)==1){
                    occurence++;
                }else{
                    occurence=0;
                }
                if(max<occurence)
                    max=occurence;
            }
            if(max!=0){
                int num=0;
                for(int i=0;i<n;i++){
                    if(str.charAt(i)==1){
                        num++;
                    }else{
                        num=0;
                    }
                    if(num==max){
                        occurence++;
                        arr[occurence]=i-num+1;
                    }
                }
            }else{

            }

        }
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        char arr1[] = bf.readLine().replaceAll(" ", "").toCharArray();
        char arr2[] = bf.readLine().replaceAll(" ", "").toCharArray();
        int l=seq(arr1,arr2, 0, 0);
        if(arr1.length<arr2.length){

        }else{

        }
    }

    public static int seq(char[] str1, char[] str2, int i, int j) {
        if (i == str1.length || j == str2.length) {
            return 0;
        }
        if (str1[i] == str2[j]) {
            System.out.print(str1[i]+" ");
            return seq(str1, str2, ++i, ++j) + 1;
        } else {
            return Math.max(seq(str1, str2, i + 1, j), seq(str1, str2, i, j + 1));
        }
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        char arr1[] = bf.readLine().replaceAll(" ", "").toCharArray();
        char arr2[] = bf.readLine().replaceAll(" ", "").toCharArray();
        int dp[][] = new int[arr1.length][arr2.length];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int l = seq(arr1, arr2, 0, 0, dp);
        System.out.println(l);
    }

    public static int seq(char[] str1, char[] str2, int i, int j, int dp[][]) {
        if (i == str1.length || j == str2.length) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int result;
        if (str1[i] == str2[j]) {
            result = seq(str1, str2, i + 1, j + 1, dp) + 1;
        } else {
            result = Math.max(seq(str1, str2, i + 1, j, dp), seq(str1, str2, i, j + 1, dp));
        }
        dp[i][j] = result;
        return result;
    }*/
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(1,1);
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            System.out.println(getCount(n, dp));
            t--;
        }
    }

    public static int getCount(Integer n, Map<Integer, Integer> dp) {
        if (n == 0)
            return 0;
        if (dp.get(n) != null)
            return dp.get(n);
        int x = getCountForANumber(n) + getCount(n - 1, dp);
        dp.put(n, x);
        return x;
    }

    public static int getCountForANumber(int n) {
        int count = 0;
        int x = n;
        for (int i = 1; i < x; i++) {
            if (n % i == 0) {
                count++;
                x /= i;
            }
        }
        return count;
    }*/

/*static int loop1=0;
static int loop2=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> dp1 = new HashMap<>();
        dp1.put(1, 1);
        Map<Integer, Integer> dp2 = new HashMap<>();
        dp2.put(1, 1);
        for (int i = 2; i <= 1000; i++) {
            dp1.put(i, dp1.get(i - 1) + getCountForANumber(i));
            dp2.put(i, dp2.get(i - 1) + getCountForANumber2(i));
        }
        System.out.println("loop1:"+loop1);
        System.out.println("loop2:"+loop2);
    }

    public static int getCountForANumber(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            loop1++;
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getCountForANumber2(int n) {
        int count = 0;
        int x = n;
        for (int i = 1; i < x; i++) {
            loop2++;
            if (n % i == 0) {
                count++;
                x = n / i;
            }
        }
        return count;
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            int dp[][] = new int[n + 1][n + 1];
            *//*for(int[] a: dp){
                Arrays.fill(a,-1);
            }*//*
            Map<Integer, Map<Integer, Boolean>> map = new HashMap<>();
            while (m > 0) {
                strNum = bf.readLine().split("\\s");
                int a = Integer.parseInt(strNum[0]);
                int b = Integer.parseInt(strNum[1]);
                updateMap(map, a, b);
                updateMap(map, b, a);
                m--;
            }
            System.out.println(getShortestPath(1, n, map, dp, 0));
            t--;
        }
    }

    private static int getShortestPath(int source, int destination, Map<Integer, Map<Integer, Boolean>> map, int[][] dp, int from) {
        if (dp[source][destination] != 0)
            return dp[source][destination];
        Map<Integer, Boolean> smallMap = map.get(source);
        int result;
        if (smallMap == null) {
            result = Integer.MAX_VALUE;
        } else if (smallMap.get(destination) != null) {
            result = 1;
        } else {
            List<Integer> list = new ArrayList(smallMap.keySet());
            list.remove(Integer.valueOf(from));
            if (list.isEmpty()) {
                result = Integer.MAX_VALUE;
            } else {
                int min = Integer.MAX_VALUE;
                for (int subSource : smallMap.keySet()) {
                    int x = getShortestPath(subSource, destination, map, dp, source);
                    if (x < min)
                        min = x;
                }
                result = min + 1;
            }
        }
        dp[source][destination] = result;
        return result;
    }

    private static void updateMap(Map<Integer, Map<Integer, Boolean>> map, int a, int b) {
        Map<Integer, Boolean> smallMap = map.get(a);
        if (smallMap != null) {
            smallMap.put(b, true);
        } else {
            map.put(a, new HashMap() {{
                put(b, true);
            }});
        }
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        while (t > 0) {
            strNum = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            int arr[][] = new int[n + 1][n + 1];
            int dp[][] = new int[n + 1][n + 1];
            while (m > 0) {
                strNum = bf.readLine().split("\\s");
                int x = Integer.parseInt(strNum[0]);
                int y = Integer.parseInt(strNum[1]);
                arr[x][y]++;
                arr[y][x]++;
                m--;
            }
            System.out.println(shortestPath(1, n, arr, dp));
            t--;
        }
    }

    private static int shortestPath(int source, int destination, int[][] arr, int[][] dp) {
        if (dp[source][destination] != 0) {
            return dp[source][destination];
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i][source] = 0;
        }
        int result;
        if (arr[source][destination] != 0) {
            result = arr[source][destination];
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < arr.length; i++) {
                if (arr[source][i] != 0) {
                    int x = shortestPath(i, destination, arr, dp);
                    if (x < min) {
                        min = x;
                    }
                }
            }
            result = min + 1;
        }
        dp[source][destination] = result;
        return result;
    }*/

    /*//Monk and the Islands->HackerEarth
    //TLE->3 passed out of 7
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        while (t > 0) {
            strNum = bf.readLine().split("\\s");
            Integer n = Integer.parseInt(strNum[0]);
            Integer m = Integer.parseInt(strNum[1]);
            Integer arr[][] = new Integer[n + 1][n + 1];
            for (Integer[] x : arr)
                Arrays.fill(x, Integer.MAX_VALUE);
            while (m > 0) {
                strNum = bf.readLine().split("\\s");
                Integer x = Integer.parseInt(strNum[0]);
                Integer y = Integer.parseInt(strNum[1]);
                arr[x][y] = arr[y][x] = 1;
                m--;
            }
            System.out.println(shortestPath(arr));
            t--;
        }
    }

    private static Integer shortestPath(Integer[][] arr) {
            int change = 0;
            for (int i = 2; i < arr.length; i++) {
                Integer min = arr[i][1];
                for (int j = 2; j < arr.length; j++) {
                    Integer x = (arr[j][i].equals(Integer.MAX_VALUE) || arr[1][j].equals(Integer.MAX_VALUE)) ? Integer.MAX_VALUE : arr[j][i] + arr[1][j];
                    if (x < min) {
                        change++;
                        min = x;
                    }
                }
                arr[1][i] = arr[i][1] = min;
            }
        return arr[1][arr.length - 1];
    }*/

    /*
    //Monk and the Islands->HackerEarth
    //TLE->3 passed out of 7 1 Runtime
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        while (t > 0) {
            strNum = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            int arr[][] = new int[n + 1][n + 1];
            int dp[][] = new int[n + 1][n + 1];
            while (m > 0) {
                strNum = bf.readLine().split("\\s");
                int x = Integer.parseInt(strNum[0]);
                int y = Integer.parseInt(strNum[1]);
                arr[x][y]++;
                arr[y][x]++;
                m--;
            }
            System.out.println(shortestPath(1, n, arr, dp));
            t--;
        }
    }

    private static int shortestPath(int source, int destination, int[][] arr, int[][] dp) {
        if (dp[source][destination] != 0) {
            return dp[source][destination];
        }
        int result;
        if (arr[source][destination] != 0) {
            result = arr[source][destination];
        } else {
            int arr2[] = new int[arr.length];
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[source][i] != 0) {
                    arr2[count] = i;
                    count++;
                }
            }
            for (int i = 1; i < arr.length; i++) {
                arr[i][source] = arr[source][i] = 0;
            }
            Integer min = Integer.MAX_VALUE;
            for (int i = 0; i < count; i++) {
                int x = shortestPath(arr2[i], destination, arr, dp);
                if (x < min) {
                    min = x;
                }
            }
            result = min.equals(Integer.MAX_VALUE) ? min : min + 1;
        }
        dp[source][destination] = result;
        return result;
    }
*/

    /*static int minDistance(int dist[], Boolean sptSet[], int V)
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

*/

    /*// Function that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    public static void dijkstra(int graph[][], int src)
    {
        int V = graph.length;
        int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet, V);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        System.out.println(dist[V-1]);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        String strNum[];
        while (t > 0) {
            strNum = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            int arr[][] = new int[n][n];
            while (m > 0) {
                strNum = bf.readLine().split("\\s");
                int x = Integer.parseInt(strNum[0]);
                int y = Integer.parseInt(strNum[1]);
                arr[x-1][y-1]++;
                arr[y-1][x-1]++;
                m--;
            }
            dijkstra(arr,0);
            t--;
        }
    }*/
/*
    public static class Queue{
        private int arr[];
        private int removeEnd;
        private int addEnd;
        int size;
        public Queue(int n){
            arr= new int[n];
            addEnd=n-1;
            size=0;
            removeEnd=n-1;
        }

        public boolean enQueue(int x) {
            if (addEnd < 0) {
                return false;
            }
            arr[addEnd--] = x;
            size++;
            return true;
        }

        public Integer deQueue(){
            if (size==0){
                return null;
            }
            size--;
            return arr[removeEnd--];
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t>0){
            String strNum[] = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int m = Integer.parseInt(strNum[1]);
            int visited[] = new int[n+1];
            int arr[][] = new int[n+1][n+1];
            while (m>0) {
                strNum = bf.readLine().split("\\s");
                int x = Integer.parseInt(strNum[0]);
                int y = Integer.parseInt(strNum[1]);
                arr[x][y] = arr[y][x] = 1;
                m--;
            }
            Queue queue = new Queue(n);
            queue.enQueue(1);
            visited[1]=1;
            System.out.println();
            System.out.print("1, ");
            updateQueue(queue, arr, visited);
            t--;
        }
    }

    private static void updateQueue(Queue queue, int arr[][], int visited[]) {
        while (queue.size != 0) {
            int x = queue.deQueue();
            for (int i = 2; i < arr.length; i++) {
                if (visited[i] == 0 && arr[x][i] != 0) {
                    System.out.print(i+", ");
                    visited[i] = 1;
                    queue.enQueue(i);
                }
            }
        }
        System.out.println(queue.arr);
    }*/

/*//Set numbers (Jan circuit 2020 hackerearth) Passed.
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    long arr[] = new long[36];
    long x = 2;
    for (int i = 0; i < 36; i++) {
        arr[i] = (long) Math.pow((double) x, (double) i) - 1;
    }
    while (t > 0) {
        int n = Integer.parseInt(bf.readLine());
        int i = 1;
        smallLoop:
        while (true) {
            if (arr[i] > n) {
                System.out.println(arr[i - 1]);
                break smallLoop;
            }
            i++;
        }
        t--;
    }
}*/
/*
6
        9
        1 10 3 4 8 10*/

/*//Equal subarrays (Jan circuit 2020 hackerearth) passed
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    long k = Long.parseLong(bf.readLine());
    String strNum[] = bf.readLine().split("\\s");
    long max = Long.parseLong(strNum[0]);
    long value = k;
    int length = 1;
    int maxLength = 1;
    int i = 0;
    int j = 1;
    while (i < n && j < n) {
        long x = Long.parseLong(strNum[j]);
        if (x > max) {
            value = value - (length) * (x - max);
            max = x;
        }
        value = value - (max - x);
        if (value < 0) {
            i++;
            j++;
            value = value + (max - Long.parseLong(strNum[i - 1]));
            if (max == Long.parseLong(strNum[i - 1])) {
                long z = ((j - i) * max) + value - k;
                max = 0;
                int o = i;
                while (o < j & o < n) {
                    long p = Long.parseLong(strNum[o]);
                    if (max < p)
                        max = p;
                    o++;
                }
                value = k - (((j - i) * max) - z);
            }
        } else {
            j++;
            length++;
        }
        if (length > maxLength)
            maxLength = length;
    }
    System.out.println(maxLength);
}*/
/*//Distribute chocolates (Jan circuit 2020 hackerearth) passed
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    mainLoop:
    while (t > 0) {
        String strNum[] = bf.readLine().split("\\s");
        long c = Long.parseLong(strNum[0]);
        long n = Long.parseLong(strNum[1]);
        long x = (n * (n + 1)) / 2;
        if (x > c) {
            System.out.println(c);
        } else {
            System.out.println((c - x) % n);
        }
        t--;
    }
}*/

/*//Random subsets on a tree (Jan circuit 2020 hackerearth)
static class Node {
    Integer value;
    Integer u;
    List<Node> nodes = new ArrayList();

    public Node(Integer value, Integer u) {
        this.value = value;
        this.u = u;
    }
}

    static long totalCombinations = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Node[] arr = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new Node(null, i);
        }
        String strNum[];
        for (int i = 1; i < n; i++) {
            strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]);
            int y = Integer.parseInt(strNum[1]);
            arr[x].nodes.add(arr[y]);
        }
        strNum = bf.readLine().split("\\s");
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(strNum[i - 1]);
            arr[i].value = x;
        }
        long calculatedValue = getValue(arr[1]);
        long numberOfAllpossibleCombinations = (long)Math.pow(2,n);
        calculatedValue += numberOfAllpossibleCombinations - 1 - totalCombinations;
        System.out.println(getAnswer(calculatedValue,numberOfAllpossibleCombinations));
    }

    private static long getValue(Node node) {
        int value = 0;
        if (node.nodes.isEmpty()) {
            return value;
        }
        for (Node x : node.nodes) {
            value += getValue(x);
        }
        int childCount = node.nodes.size();
        if (childCount == 1) {
            return value;
        }
        long mul = 1;
        long sum = 0;
        for (int i = 0; i < childCount; i++) {
            long x = countChilds(node.nodes.get(i), node.value);
            long y = (long) Math.pow(2, x);
            mul *= y;
            sum += y;
        }
        sum -= (childCount - 1);
        long combinations = (mul - sum);
        totalCombinations += combinations;
        long result = (node.u) * combinations;
        return value+result;
    }

    public static int countChilds(Node node, int value) {
        int x = 0;
        if (value > node.value) {
            x = 1;
        }
        if (node.nodes.isEmpty()) {
            return x;
        }
        for (Node child : node.nodes) {
            x += countChilds(child, value);
        }
        return x;
    }

    static long getAnswer(Long x, Long y) {
        Long m = 1000000007L;
        x = x % m;
        return (x * (((new BigInteger(y.toString())).modInverse(new BigInteger(m.toString()))).longValue())) % m;
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        mainLoop:
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            String strNum[] = bf.readLine().split("\\s");
            if (n <= 2) {
                System.out.println("No");
                t--;
                continue mainLoop;
            }
            int min = Integer.parseInt(strNum[0]);
            int max = Integer.parseInt(strNum[1]);
            for (int i = 2; i < n; i++) {
                int x = Integer.parseInt(strNum[i]);
                boolean smallerPresent = false;
                for (int j = 0; j < i; j++) {
                    if (smallerPresent) {
                        if (x < Integer.parseInt(strNum[j])) {
                            System.out.println("Yes");
                            t--;
                            continue mainLoop;
                        }
                    } else {
                        if (x > Integer.parseInt(strNum[j])) {
                            smallerPresent = true;
                        }
                    }
                }
            }
            System.out.println("No");
            t--;
        }
    }
*/
   /* public static void main(String[] args) throws IOException {
        String s1 = "}}}";
        String s2 = "}}}}";
        String s3 = "}";
        String s4 = "}}}}}";
        s1=s1.replaceAll("}}","a");
        System.out.println(getOcc(s1));
        System.out.println(s2.replaceAll("}}","a"));
        System.out.println(s3.replaceAll("}}","a"));
        System.out.println(s4.replaceAll("}}","a"));

        System.out.println(getOcc(s1));
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //int t = Integer.parseInt(bf.readLine());
    }

    public static int getOcc(String s){
        int counter = 0;
        for( int i=0; i<s.length(); i++ ) {
            if( s.charAt(i) == '}' ) {
                counter++;
            }
        }
        return counter;
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            char[] arr = bf.readLine().toCharArray();
            int n = arr.length;
            int stackCount = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == '{') {
                    stackCount++;
                } else {
                    if (i + 1 != n && arr[i + 1] == '}') {
                        i++;
                        if (stackCount != 0) {
                            stackCount--;
                        } else {
                            count++;
                        }
                    } else {
                        count++;
                        if (stackCount != 0) {
                            stackCount--;
                        } else {
                            count++;
                        }
                    }
                }
            }
            count += 2 * stackCount;
            System.out.println(count);
            t--;
        }
    }

}

