import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;


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

   /* public static void main(String[] args) throws IOException {
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
    }*/
/*
//HackerEarth Arena Valid Ip Address
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String arr[] = str.split("\\.");
            if (arr.length != 4) {
                System.out.println("NO");
                return;
            }
            try {
                for (int i = 0; i < 4; i++) {
                    int x = Integer.parseInt(arr[i]);
                    if (x < 0 || x > 255) {
                        System.out.println("NO");
                    }
                }
                System.out.println("YES");
            } catch (Exception e) {
                System.out.println("NO");
            }
        }*/


   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            int k = Integer.parseInt(bf.readLine());
            int p = Integer.parseInt(bf.readLine());
            int distinct = 0;
            Map<Long, Long> map = new HashMap<>();
            String arr[] = bf.readLine().split("\\s");
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(arr[i]);
                Long r = map.get(x);
                if (r == null) {
                    map.put(x, 1L);
                    distinct++;
                }
            }
            int l = distinct - k;
            if (l < 0)
                l = 0;
            System.out.println(l * p);
            t--;
        }
    }
*/
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(10, 10);
        map.put(230, 5);
        map.put(559, 8);
        map.put(1009, 2);
        map.put(5000, 7);
        map.put(10000, 8);
        map.put(1000000000, 3);
        while (t > 0) {
            String[] strNum = bf.readLine().split("\\s");
            int current = Integer.parseInt(strNum[0]);
            int finalVal = Integer.parseInt(strNum[1]);
            int time = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    if (current <= e.getKey()) {
                        int l = e.getKey();
                        if (finalVal < l) {
                            l = finalVal;
                        }
                        int x = ((l - current) / e.getValue());
                        time += x;
                        current += x * e.getValue();
                        if (current < finalVal) {
                            time++;
                            current += e.getValue();
                        } else {
                            break;
                        }
                    }
            }
            System.out.println(time);
            t--;
        }
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        char[] arr = bf.readLine().replaceAll(" ","").toCharArray();
        if(n==1){
            System.out.println("1");
            return;
        }
        int count=0;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]==arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }*/

    /*public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String p = bf.readLine();
        while(!(p!=null && !p.trim().equals(""))){
            p = bf.readLine();
            continue;
        }
        int t = Integer.parseInt(p.trim());
        String[] strNum;
        while(t>0){
            String str = bf.readLine();
            str=str.trim();
            strNum=str.split(" +");
            int m=Integer.parseInt(strNum[0]);
            int n=Integer.parseInt(strNum[1]);
            int x=Integer.parseInt(strNum[2]);
            int y=Integer.parseInt(strNum[3]);
            x=x-1;
            y=y-1;
            m=m-1;
            int[][] Jail=new int[m][n];
            for(int i=0;i<m;i++){
                strNum = bf.readLine().trim().split(" +");
                for(int j=0;j<n;j++)
                    Jail[i][j]=Integer.parseInt(strNum[j]);
            }
            int chefPower=Jail[0][0];
            Jail[0][0]=0;
            if(findPath(chefPower,Jail,x,y,m,n))
                System.out.print("Escape");
            else
                System.out.println("Died");
            t--;
        }

    }
    public static int min(int a,int b,int c){
        if(a<=b&&a<=c) return(a);
        if(b<=a&&b<=c) return(b);
        return c;
    }
    public static boolean findPath(int chefPower,int[][]Jail,int x,int y,int m,int n){
        int[][] MinCost=new int[m][n];
        int i,j;
        MinCost[0][0]=0;
        for (i=1; i<=x; i++)
            MinCost[0][i] = MinCost[0][i-1] + Jail[0][i];
        for (i=1; i<=y; i++)
            MinCost[i][0] = MinCost[i-1][0] + Jail[i][0];
        for (i=1;i<=x; i++){
            for (j=1; j<=y; j++)
                MinCost[i][j] = min(MinCost[i-1][j],MinCost[i][j-1],MinCost[i-1][j-1]) + Jail[i][j];
        }
        return(chefPower>=MinCost[x][y]);
    }}*/


   /* public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String p = bf.readLine();
        while (!(p != null && !p.trim().equals(""))) {
            p = bf.readLine();
            continue;
        }
        int t = Integer.parseInt(p.trim());
        String[] strNum;
        while (t > 0) {
            String str = bf.readLine();
            str = str.trim();
            strNum = str.split(" +");
            int m = Integer.parseInt(strNum[0]);
            int n = Integer.parseInt(strNum[1]);
            int x = Integer.parseInt(strNum[2]);
            int y = Integer.parseInt(strNum[3]);
            x = x - 1;
            y = y - 1;
            m = m - 1;
            int[][] jail = new int[m][n];
            int [][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                strNum = bf.readLine().trim().split(" +");
                for (int j = 0; j < n; j++)
                    jail[i][j] = Integer.parseInt(strNum[j]);
            }
            int smallestPath = findSmallestPath(jail, dp, x, y);
        }
    }

    private static int findSmallestPath(int[][] jail, int[][] dp, int x, int y) {
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            bf.readLine();
            String strNum[] = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[strNum.length - 1]);
            int sum = x;
            for (int i = strNum.length - 2; i >= 0; i--) {
                int y = Integer.parseInt(strNum[i]);
                if (x < y) {
                    y = x;
                }
                x = y;
                sum += x;
            }
            System.out.println(sum);
            t--;
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
            int arr[] = new int[n + 2];
            while (m > 0) {
                strNum = bf.readLine().split("\\s");
                int l = Integer.parseInt(strNum[0]);
                int r = Integer.parseInt(strNum[1]);
                arr[l]++;
                arr[r + 1]--;
                m--;
            }
            int result[][] = new int[3][2];
            int availableShop;
            int availableCount = 0;
            int max = 0;
            for (int i = 1; i <= n; i++) {
                max += arr[i];
                availableCount = max;
                availableShop = i;
                if (availableCount > result[0][1]) {
                    int tempShop = result[0][0];
                    int tempCount = result[0][1];
                    result[0][0] = availableShop;
                    result[0][1] = availableCount;
                    availableShop = tempShop;
                    availableCount = tempCount;
                }
                if (availableCount > result[1][1]) {
                    int tempShop = result[1][0];
                    int tempCount = result[1][1];
                    result[1][0] = availableShop;
                    result[1][1] = availableCount;
                    availableShop = tempShop;
                    availableCount = tempCount;

                } else if (availableCount == result[1][1] && availableShop < result[1][0]) {
                    int tempShop = result[1][0];
                    int tempCount = result[1][1];
                    result[1][0] = availableShop;
                    result[1][1] = availableCount;
                    availableShop = tempShop;
                    availableCount = tempCount;
                }


                if (availableCount > result[2][1]) {
                    int tempShop = result[2][0];
                    int tempCount = result[2][1];
                    result[2][0] = availableShop;
                    result[2][1] = availableCount;
                } else if (availableCount == result[2][1] && availableShop < result[2][0]) {
                    int tempShop = result[2][0];
                    int tempCount = result[2][1];
                    result[2][0] = availableShop;
                    result[2][1] = availableCount;
                }
            }

            List<Integer> list = new ArrayList() {{
                add(result[0][0]);
                add(result[1][0]);
                add(result[2][0]);
            }};
            Collections.sort(list);
            System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
            t--;
        }
    }*/
    //
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String strNum[] = bf.readLine().split("\\s");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strNum[i]);
        }
        int q = Integer.parseInt(bf.readLine());

        for (int i = 0; i < q; i++) {
            strNum = bf.readLine().split("\\s");
            if (strNum[0].equals("Left") || strNum[0].equals("Right")) {
                int count = 0;
                while (strNum[0].equals("Left") || strNum[0].equals("Right")) {
                    if (strNum[0].equals("Left")) {
                        count++;
                    } else {
                        count--;
                    }
                    i++;
                    if (i < q) {
                        strNum = bf.readLine().split("\\s");
                    } else {
                        return;
                    }
                }
                performShift(arr, count);
                performOperation(strNum, arr);
                continue;
            }
            performOperation(strNum, arr);
        }


    }

    private static void performOperation(String[] strNum, int[] arr) {
        switch (strNum[0]) {
            case "Increment":
                performIncrement(arr, Integer.parseInt(strNum[1]));
                break;
            case "Update":
                performUpdate(arr, Integer.parseInt(strNum[1]), Integer.parseInt(strNum[2]));
                break;
            case "?":
                performPrint(arr, Integer.parseInt(strNum[1]));
                break;
        }
    }

    private static void performPrint(int[] arr, int index) {
        System.out.println(arr[index - 1]);
    }

    private static void performUpdate(int[] arr, int index, int value) {
        arr[index - 1] = value;
    }

    private static void performIncrement(int[] arr, int index) {
        arr[index - 1]++;
    }

    private static void performShift(int[] arr, int count) {
        if (count == 0) {
            return;
        } else if (count > 0) {
            performLeftShift(arr, count);
        } else {
            performRightShift(arr, -count);
        }
    }

    *//*private static void performRightShift(int[] arr, int count) {
        int x[] = new int[count];
        for (int i = 0; i < count; i++)
            x[i] = arr[arr.length - count + i];
        for (int i = arr.length - count - 1; i >= 0; i--) {
            arr[i + count] = arr[i];
        }
        for (int i = 0; i < count; i++) {
            arr[i] = x[i];
        }
    }*//*
    static void reverseArray(int arr[], int start,
                             int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to right rotate
    // arr[] of size n by d
    static void performRightShift(int arr[], int d)
    {
        int n = arr.length;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
    }

    *//*private static void performLeftShift(int[] arr, int count) {
        int x[] = new int[count];
        for (int i = 0; i < count; i++)
            x[i] = arr[count-1];
        for (int i = count; i < arr.length; i++) {
            arr[i - count] = arr[i];
        }
        for (int i = 0; i < count; i++) {
            arr[arr.length - count + i] = x[i];
        }
    }*//*

    private static void performLeftShift(int arr[], int d)
    {
        int n = arr.length;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            *//* move i-th values of blocks *//*
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }*/

   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t>0){
            String[] strNum = bf.readLine().split("\\s");
            int a = Integer.parseInt(strNum[0]);
            int H = Integer.parseInt(strNum[1]);
            int THETA_MAX = Integer.parseInt(strNum[2]);
            int x = (int)(a*Math.tan(Math.toRadians(THETA_MAX)))/2;
            System.out.println(H-x);
            t--;
        }
    }*/

   /*//HackerRank longest sequence having 1 allowing one zero
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            int max = 0;
            int count = 0;
            int secondMax = 0;
            int z =0;
            boolean zeroAllowed = true;
            for (char x : str.toCharArray()) {
                if (x == '1') {
                    count++;
                    secondMax++;
                } else {
                    if (zeroAllowed) {
                        zeroAllowed = false;
                        z=count;
                        count++;
                        if(max<secondMax){
                            max=secondMax;
                        }
                        secondMax=0;
                    } else {
                        if (max < count) {
                            max = count;
                        }
                        secondMax=count-z;
                        zeroAllowed = true;
                        count = 0;
                    }
                }
            }
            if (max < count) {
                max = count;
            }

            if (max < secondMax) {
                max = secondMax;
            }
            System.out.println(max);
            t--;
        }
    }*/

   /*//HackerEarth Minimum length subarray Wissen Java Developer Hiring Challenge
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            String sString = bf.readLine();
            String tString = bf.readLine();

            sString = sString.substring(0, Math.min(tString.length(), sString.length()));
            int arr[] = new int[26];
            for (char x : tString.toCharArray()) {
                arr[x - 97]++;
            }
            int count = 0;
            for (char x : sString.toCharArray()) {
                int z = x-97;
                if (arr[z] != 0) {
                    arr[z]--;
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }*/

   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            String[] strNum = bf.readLine().split("\\s");
            int n = Integer.parseInt(strNum[0]);
            int k = Integer.parseInt(strNum[1]);
            strNum = bf.readLine().split("\\s");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strNum[i]);
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int count = 0;
                smallLoop:
                for (int j = i; j < n; j++) {
                    count++;
                    sum += arr[j];
                    if (sum % k == 0) {
                        if (min > count)
                            min = count;
                        break smallLoop;
                    }
                }
            }
            System.out.println(min);
            t--;
        }
    }*/

   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<String, Boolean> map = new HashMap<>();
        int t = 10;
        int count = 0;
        while (t > 0) {
            String[] strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]);
            for (int i = 1; i < 10; i++) {
                int y = Integer.parseInt(strNum[i]);
                String key = getKey(x, y);
                if (map.get(key) == null) {
                    count++;
                    map.put(key, true);
                    map.put(getKey(y, x), true);
                }
            }
            t--;
        }
        System.out.println((((n) * (n - 1)) / 2) - count);
    }

    private static String getKey(int x, int y) {
        return x + "-" + y;
    }*/

   /*//March Circuits '20 LIVE Annoying Chemistry
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strNum = bf.readLine().split("\\s");
        int x = Integer.parseInt(strNum[0]);
        int y = Integer.parseInt(strNum[1]);
        int p = Integer.parseInt(strNum[2]);
        int q = Integer.parseInt(strNum[3]);

        int i = 1;
        while (true) {
            if (((((long)p * (long)i) % (long)x) == (long)0) && (((long)q * (long)i) % (long)y) == (long)0) {
                System.out.println((((long)p * (long)i) / (long)x) + " " + (((long)q * (long)i) / (long)y) + " " + (long)i);
                return;
            }
            i++;
        }
    }*/

    //TLE
   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String strNum[] = bf.readLine().split("\\s");
        int arr[] = new int[2 * n];
        int arr4[] = new int[2 * n];
        int arr3[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(strNum[i]);
            arr[i] = x;
            arr[n + i] = x;
            arr4[i] = i + 1;
            arr4[n + i] = i + 1;
        }
        int q = Integer.parseInt(bf.readLine());
        getAnswer(arr, arr3, arr4, n);
        while (q > 0) {
            strNum = bf.readLine().split("\\s");
            int x = Integer.parseInt(strNum[0]);
            int y = Integer.parseInt(strNum[1]);
            System.out.println(getMin(arr, arr3, arr4, x, y, n));
            q--;
        }
    }
    private static int getMin(int[] arr, int[] arr3, int[] arr4, int x, int y, int n) {
        x = x - 1;
        int min = n;
        int j = n + x;
        for (int i = 0; i < n; i++) {
            if (arr[x] == arr4[j] && y != arr4[j])
                arr3[i]++;
            else if (arr[x] != arr4[j] && y == arr4[j])
                arr3[i]--;
            if (arr3[i] < min)
                min = arr3[i];
            j--;
        }
        arr[x] = y;
        arr[x + n] = y;
        return min;
    }

    private static int getAnswer(int[] arr, int[] arr3, int[] arr4, int n) {
        int min = n;
        int shift = 0;
        for (int i = 0; i < n; i++) {
            int mismatch = 0;
            for (int j = 0; j < n; j++) {
                if (arr4[j] != arr[i + j]) {
                    mismatch++;
                }
            }
            int result = mismatch + shift;
            if (result < min)
                min = result;
            *//*if(min==shift){
                break;
            }*//*
            arr3[i] = result;
            shift++;
        }
        return min;
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strNum = bf.readLine().split("\\s");
        int n = Integer.parseInt(strNum[0]);
        int k = Integer.parseInt(strNum[1]);
        int q = Integer.parseInt(strNum[2]);
        Map<Integer, TreeMap<Integer, Integer>> map = new HashMap<>();
        while(n>0){
            strNum = bf.readLine().split("\\s");
            int s = Integer.parseInt(strNum[0]);
            int t = Integer.parseInt(strNum[1]);
            TreeMap<Integer, Integer> x = map.get(t);
            putIfAbsent(s, x);
            n--;
        }
        mainLoop:
        while(q>0){
            strNum = bf.readLine().split("\\s");
            int type = Integer.parseInt(strNum[0]);
            int p = Integer.parseInt(strNum[1]);
            int team = Integer.parseInt(strNum[2]);
            if(type==1){
                putIfAbsent(p, map.get(team));
            }else{
                TreeMap<Integer, Integer> x = map.get(p);
                TreeMap<Integer, Integer> y = map.get(team);
                while(true){
                    Map.Entry<Integer, Integer> entry = x.lastEntry();
                    int xAttack = entry.getKey();
                    destroyY:
                    while(xAttack>0){
                        if(y.isEmpty()){
                            System.out.println(p);
                            q--;
                            continue mainLoop;
                        }
                        Map.Entry<Integer, Integer> yEntry = y.lastEntry();
                        if(yEntry.getValue()>=xAttack){
                            yEntry.setValue(yEntry.getValue()-xAttack);
                            if(yEntry.getValue()==0){
                                y.remove(Integer.valueOf(yEntry.getKey()));
                            }
                        }else{
                            xAttack-=yEntry.getValue();
                            y.remove(Integer.valueOf(yEntry.getKey()));
                        }
                    }
                }
            }
            q--;
        }
    }

    private static void putIfAbsent(int s, TreeMap<Integer, Integer> x) {
        Integer y = x.get(s);
        if (y == null) {
            x.put(s, 1);
        } else {
            x.put(s, ++y);
        }
    }*/

    //Fighting pits hackerrank 5 test case runtime 15 TLE out of 38
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strNum = bf.readLine().split("\\s");
        int n = Integer.parseInt(strNum[0]);
        int k = Integer.parseInt(strNum[1]);
        int q = Integer.parseInt(strNum[2]);

        int arr[][] = new int[k+1][n+1+q];
        int size[] = new int[k+1];

        for(int i=0;i<n;i++){
            strNum = bf.readLine().split("\\s");
            int s = Integer.parseInt(strNum[0]);
            int t = Integer.parseInt(strNum[1]);
            size[t]++;
            arr[t][size[t]]=s;
        }
        for(int i=1;i<=k;i++){
            sort(arr[i], 1, size[i]);
        }
        while(q>0){
            strNum = bf.readLine().split("\\s");
            int a = Integer.parseInt(strNum[0]);
            int b = Integer.parseInt(strNum[1]);
            int c = Integer.parseInt(strNum[2]);
            if(a==1){
                size[c]++;
                arr[c][size[c]]=b;
            }else{
                int x = size[b];
                int y = size[c];
                boolean decider = true;
                while(x>0&&y>0){
                    if(decider){
                        int attack = arr[b][x];
                        y-=attack;
                    }else{
                        int attack = arr[c][y];
                        x-=attack;
                    }
                    decider=!decider;
                }
                if(x>0){
                    System.out.println(b);
                }else{
                    System.out.println(c);
                }
            }
            q--;
        }
    }

    *//*public static void insertElement(int[] arr, int x, int size){
        int pos = size+1;
        while(arr[size]>x){
            arr[size+1]=arr[size];
            size--;
            pos--;
        }
        arr[pos]=x;
    }*//*

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        *//* Create temp arrays *//*
        int L[] = new int [n1];
        int R[] = new int [n2];

        *//*Copy data to temp arrays*//*
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        *//* Merge the temp arrays *//*

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        *//* Copy remaining elements of L[] if any *//*
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        *//* Copy remaining elements of R[] if any *//*
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }*/

    //HackerRank passed
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = bf.readLine().toCharArray();
        int[] arr = new int[26];
        for (char x : charArr) {
            arr[x - 97]++;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 26; i++) {
            int x = arr[i];
            if (x != 0) {
                Integer frequency = map.get(x);
                if (frequency == null) {
                    map.put(x, 1);
                } else {
                    map.put(x, ++frequency);
                }
            }
        }
        if (map.size() == 1) {
            System.out.println("YES");
            return;
        } else if (map.size() == 2) {
            if ((map.firstKey() + map.firstEntry().getValue() == 2) || (map.lastKey() + map.lastEntry().getValue() == 2)) {
                System.out.println("YES");
                return;
            } else if (map.lastKey() - map.firstKey() == 1 && map.lastEntry().getValue() == 1) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }*/

    //HackerRank Highest Value Palindrome Passed all test cases
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strNum[] = bf.readLine().split("\\s");
        int n = Integer.parseInt(strNum[0]);
        int k = Integer.parseInt(strNum[1]);
        char[] arr= bf.readLine().toCharArray();
        int count=0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                count++;
            }
        }
        if(count>k){
            System.out.println("-1");
            return;
        }
        int count2= k-count;
        for(int i=0;i<n/2;i++){
            int x = Character.getNumericValue(arr[i]);
            int y = Character.getNumericValue(arr[n-1-i]);
            if(count2>0){
                if(x==y){
                    if(x!=9&&count2!=1){
                        arr[i]=arr[n-1-i]='9';
                        count2-=2;
                        continue;
                    }
                }else{
                    arr[i]=arr[n-1-i]='9';
                    if(x!=9&&y!=9){
                        count2--;
                    }
                }
            }else{
                int value = Math.max(x,y);
                arr[i]=arr[n-1-i]=(char)(value+'0');
            }
        }
        if(n%2!=0&&count2>0){
            arr[n/2]='9';
        }
        for (char x : arr)
            System.out.print(x);
    }*/

    //HackerRank Maximum Palindromes Passed all test cases
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = bf.readLine().toCharArray();
        int n = charArr.length;
        long q = Integer.parseInt(bf.readLine());
        long arr[][] = new long[26][n + 1];
        TreeMap<Long, Long> map = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            char x = charArr[i - 1];
            arr[x - 97][i] = 1;
        }
        for (int i = 0; i < 26; i++) {
            cummulateIt(arr[i], n + 1);
        }

        while (q > 0) {
            String strNum[] = bf.readLine().split("\\s");
            int l = Integer.parseInt(strNum[0]);
            int r = Integer.parseInt(strNum[1]);
            calculateResult(arr, l, r, map);
            q--;
        }
    }

    private static void calculateResult(long[][] arr, int l, int r, TreeMap<Long, Long> map) {
        long count = 0;
        long count2 = 0;
        long count3 = 1;
        long m = 1000000007;
        for (int i = 0; i < 26; i++) {
            long value = arr[i][r] - arr[i][l - 1];
            if (value != 0) {
                long count4 = value / 2;
                count += count4;
                count3 = (((count3 % m) * (getModuloInverse(calculateFactorial(count4, map)))) % (long) m);
                if (value % 2 == 1) {
                    count2++;
                }
            }
        }
        long factorial = calculateFactorial(count, map);
        factorial = (((factorial * count3)) % m);
        factorial = factorial % m;
        count2 = count2 % m;
        if (factorial == 0) {
            factorial = 1;
        }
        if (count2 == 0) {
            count2 = 1;
        }
        System.out.println((factorial * count2) % m);
    }

    private static long getModuloInverse(long number) {
        long m = 1000000007;
        return getPower(number) % m;
    }

    private static long getPower(long number) {
        long power = 1000000005;
        return calculatePower(power, number);
    }

    private static long calculatePower(long n, long x) {
        long m = 1000000007;
        if (n == 1) {
            return x % m;
        } else if (n == 0) {
            return 1;
        }
        long r = calculatePower(n / 2, x);
        if (n % 2 == 0) {
            return ((r % m) * (r % m)) % m;
        } else {
            return ((((r % m) * (r % m)) % m) * (x % m)) % m;
        }
    }

    private static long calculateFactorial(long count, TreeMap<Long, Long> map) {
        Map.Entry<Long, Long> e = map.floorEntry(count);
        long m = 1000000007;
        long key, value;
        if (e != null) {
            key = e.getKey();
            value = e.getValue();
        } else {
            key = 1;
            value = 1;
        }
        for (long i = key + 1; i <= count; i++) {
            value = ((value % m) * i) % m;
            map.put(i, value);
        }
        return value;
    }

    private static void cummulateIt(long[] arr, long n) {
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
    }
*/
   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = bf.readLine().toCharArray();
        Map<Character, Boolean> map = new HashMap();
        map.put('a', true);
        map.put('e', true);
        map.put('i', true);
        map.put('o', true);
        map.put('u', true);
        int n = Integer.parseInt(bf.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (isVowel(map, arr[i]))
                max++;
        }
        int removingIndex = 0;
        int val = max;
        int result = 0;
        for (int i = n; i < arr.length; i++) {
            boolean wasRemovedCharVowel = isVowel(map, arr[removingIndex]);
            boolean isNewCharVowel = isVowel(map, arr[i]);
            if (wasRemovedCharVowel) {
                if (!isNewCharVowel) {
                    val--;
                }
            } else {
                if (isNewCharVowel) {
                    val++;
                    if (val > max) {
                        max = val;
                        result = removingIndex + 1;
                    }
                }
            }
            removingIndex++;
        }
        if (max == 0) {
            System.out.println("Not found!");
        } else {
            for (int i = result; i < result + n; i++)
                System.out.print(arr[i]);
        }
    }
//kangana
    private static boolean isVowel(Map<Character, Boolean> map, char c) {
        //return c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
        return map.get(c) != null;
    }*/
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap();
        while(n>0){
            String key = getKey(bf.readLine());
            Integer value = map.get(key);
            if(value==null){
                map.put(key,1);
            }else{
                map.put(key,++value);
            }
            n--;
        }
        int q = Integer.parseInt(bf.readLine());
        while(q>0){
            String key = getKey(bf.readLine());
            Integer value = map.get(key);
            if(value==null){
                System.out.println("0");
            }else{
                System.out.println(value);
            }
            q--;
        }
    }

    private static String getKey(String str) {
        int[] arr = new int[26];
        for(char x: str.toCharArray()){
            arr[x-97]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            char x = (char)(97+i);
            sb.append(x);
            sb.append(arr[i]);
        }
        return sb.toString();
    }*/

    /*public static void main(String[] args) {
        List<Map> m = new ArrayList<>();
        Map m1 = new HashMap();
        Map m2 = new HashMap();
        Map m3 = new HashMap();
        m1.put("id", "1");
        m2.put("id", "2");
        m2.put("id", "2");
        m.add(m1);
        m.add(m2);
       // m.add(m3);
        List<Map> result = m.stream().filter(o -> o.get("id").toString().equals("3")).collect(Collectors.toList());
        List<Map> result2 = m.stream().filter(o -> o.get("id").toString().equals("2")).collect(Collectors.toList());
        System.out.println(result2);
    }*/

   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strNum = bf.readLine().split("\\s");
        int n = Integer.parseInt(strNum[0]);
        double range = Double.parseDouble(strNum[1]);
        strNum = bf.readLine().split("\\s");
        double arr[] = new double[n];
        int x=0;
        for(String str: strNum){
            arr[x++]=Double.parseDouble(str);
        }
        int count = 0;
        Arrays.sort(arr);
        double firstPosition = arr[0];
        int lastAntena = -1;
        double currentPosition = arr[0];
        mainLoop:
        for(int i=0;i<n;i++){
            currentPosition = arr[i];
            if((currentPosition-firstPosition)>range){
                count++;
                lastAntena = i-1;
                for(;i<n;i++){
                    if(arr[i]-arr[lastAntena]>range){
                        firstPosition=arr[i];
                        continue mainLoop;
                    }
                }
            }
        }
        if(lastAntena==-1){
            count++;
        }else if(currentPosition-arr[lastAntena]>range){
            count++;
        }
        System.out.println(count);
    }*/


    //Alternating characters - HackerRank - passed (easy)
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            char[] arr = bf.readLine().toCharArray();
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }*/

    //Pairs - HackerRank - passed (Medium)
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strNum[] = bf.readLine().split("\\s");
        int n = Integer.parseInt(strNum[0]);
        int k = Integer.parseInt(strNum[1]);
        strNum = bf.readLine().split("\\s");
        int count=0;
        Map<Integer, Boolean> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(strNum[i]);
            if(map.get(x-k)!=null){
                count++;
            }
            if(map.get(x+k)!=null){
                count++;
            }
            map.put(x,true);
        }
        System.out.println(count);
    }*/

    //scofield
    //HackerRank - Gridland Metro Medium passed all test cases
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strNum[] = bf.readLine().split("\\s");
        Long n = Long.parseLong(strNum[0]);
        Long m = Long.parseLong(strNum[1]);
        Long k = Long.parseLong(strNum[2]);

        Map<Long, TreeMap<Long, Long>> map = new HashMap<>();
        while (k > 0) {
            strNum = bf.readLine().split("\\s");
            Long r = Long.parseLong(strNum[0]);
            Long c1 = Long.parseLong(strNum[1]);
            Long c2 = Long.parseLong(strNum[2]);
            TreeMap<Long, Long> innerMap = map.get(r);
            if (innerMap != null) {
                Long x = innerMap.get(c1);
                if(x!=null){
                    if(c2>x){
                        innerMap.put(c1, c2);
                    }
                }else{
                    innerMap.put(c1, c2);
                }
            } else {
                innerMap = new TreeMap<Long, Long>();
                innerMap.put(c1, c2);
                map.put(r, innerMap);
            }
            k--;
        }
        Long count = (n - map.size()) * m;
        for (Map.Entry<Long, TreeMap<Long, Long>> e : map.entrySet()) {
            TreeMap<Long, Long> innerMap = e.getValue();
            Long start = innerMap.firstKey();
            Long end = innerMap.firstEntry().getValue();
            for (Map.Entry<Long, Long> e2 : innerMap.entrySet()) {
                Long x = e2.getKey();
                Long y = e2.getValue();
                if (y > end) {
                    if (x > end) {
                        count += ((x - end) - 1);
                    }
                    end = y;
                }

            }
            count += (m - (end - start + 1));
        }
        System.out.println(count);
    }*/

   /* public static void main(String[] args) {
        List<Emp> emps = new ArrayList<Emp>();
        emps.add(new Emp("x","1"));
        emps.add(new Emp("y","1"));
        emps.add(new Emp("z","1"));
        emps.add(new Emp("x","1"));
        emps.add(new Emp("y","1"));

        Map<String, Boolean> map = emps.stream().collect(Collectors.toMap(x->x.getName(), x->true, (x1,x2)->x1));
        System.out.println(map);
    }*/

   //HackerRank - The Maximum Subarray All Test Case passed
   /*public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(bf.readLine());
      while (t > 0) {
         int n = Integer.parseInt(bf.readLine());
         String strNum[] = bf.readLine().split("\\s");
         int currentSum = 0;
         int maxNegative = Integer.MIN_VALUE;
         boolean hasNoPositiveNumber = true;
         int max = Integer.MIN_VALUE;
         int maxSubSeq = 0;
         int subSeq2 = 0;
         for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(strNum[i]);
            currentSum += x;
            if (x >= 0) {
               maxSubSeq += x;
               hasNoPositiveNumber = false;
            } else {
               if (x > maxNegative) {
                  maxNegative = x;
               }
            }
            if (currentSum < x) {
               currentSum = x;
            }
            if (currentSum > max) {
               max = currentSum;
            }
         }
         if (hasNoPositiveNumber) {
            maxSubSeq = maxNegative;
         }
         System.out.println(max + " " + maxSubSeq);
         t--;
      }
   }*/


}
