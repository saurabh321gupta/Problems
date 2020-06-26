/*
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Solution{
    //Google fooBar challenge 1 passed
    */
/*public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(2);
        int i=3;
        int arr[] = new int[10000];
        arr[0]=2;
        int pos = 0;
        mainLoop:
        while(true){
            for(int x=0;x<pos;x++){
                int w = arr[x];
                if(i%w==0){
                    i+=2;
                    continue mainLoop;
                }
            }
            arr[++pos]= i;
            sb.append(i);
            if(sb.length()>=(n+5)){
                return sb.toString().substring(n,n+5);
            }
            i+=2;
        }

    }*//*


    //Google fooBar challenge2 PowerHungry passed
    */
/*public static String solution(int[] xs) {
        String result = "1";
        int negativeCount = 0;
        boolean hasAtleastOne = false;
        boolean hasAtleastOneZero = false;
        int biggestNegativeNumber = Integer.MIN_VALUE;
        for (int i = 0; i < xs.length; i++) {
            int x = xs[i];
            if (x != 0) {
                if (x > 0) {
                    hasAtleastOne = true;
                }
                result = new BigInteger(result).multiply(new BigInteger("" + Math.abs(x))).toString();
                if (x < 0) {
                    if (x > biggestNegativeNumber)
                        biggestNegativeNumber = x;
                    negativeCount++;
                }
            } else {
                hasAtleastOneZero = true;
            }
        }
        if (negativeCount % 2 == 1) {
            result = new BigInteger(result).divide(new BigInteger("" + Math.abs(biggestNegativeNumber))).toString();
        }
        if (!hasAtleastOne && negativeCount < 2) {
            if (hasAtleastOneZero) {
                result = "0";
            } else {
                result = "" + biggestNegativeNumber;
            }
        }
        return result;
    }*//*


    */
/*private static int getCount(int abs) {
        int count = 0;
        while (abs != 0) {
            abs /= 10;
            count++;
        }
        return count;
    }

    private static String multiply(String result, int y) {
        StringBuilder sb = new StringBuilder();
        char[] arr = result.toCharArray();
        int carry = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int z = Character.getNumericValue(arr[i]);
            int d = z * y;
            d += carry;
            sb.append(d % 10);
            carry = d / 10;
        }
        if (carry != 0) {
            sb.append(new StringBuilder("" + carry).reverse());
        }
        return sb.reverse().toString();
    }

    *//*


    public static int solution(String n, int b) {
        int w = Integer.parseInt(n);
        int k = 0;
        while (w != 0) {
            k++;
            w /= 10;
        }
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        while (true) {
            if (!map.containsKey(n)) {
                map.put(n, ++i);
                StringBuilder xNum = getXNum(n, k);
                String xNumDecimal = baseConversion(xNum.toString(), b, 10);
                String yNumDecimal = baseConversion(xNum.reverse().toString(), b, 10);
                n = "" + (Integer.parseInt(xNumDecimal) - Integer.parseInt(yNumDecimal));
                n = baseConversion(n, 10, b);
            } else {
                return i - map.get(n) + 1;
            }
        }
    }

    public static String baseConversion(String number, int sBase, int dBase) {
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

    private static StringBuilder getXNum(String n, int k) {
        int arr[] = new int[10];
        for (char x : n.toCharArray()) {
            arr[Character.getNumericValue(x)]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append("" + i);
                k--;
            }
        }
        for (int i = 0; i < k; i++) {
            sb.append("0");
        }
        return sb;
    }

    public static void main(String[] args) {
        int[] arr = new int[50];
        for(int i=0;i<50;i++){
            arr[i] = 1000;
        }
        //System.out.println(baseConversion("211110",3,10));
        System.out.println(Solution.solution("1211", 10));
     //   System.out.println(Solution.solution("1211", 10));
       // System.out.println(Solution.solution(arr));
        //System.out.println(Solution.solution(new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000}));
       // String num = "300";
       // int n = 30;
//        String number = "1002";
//        int divisor = 2;
//        System.out.println(divide(number,divisor));
        //System.out.println(longDivision(num,n));
    }



    public static String divide(String str, int divisor) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        int carry = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = carry * 10 + Character.getNumericValue(arr[i]);
            sb.append(x / divisor);
            carry = x % divisor;
        }
        String result = sb.toString();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '0') {
                return result.substring(i);
            }
        }
        return "";
    }
}


import java.util.HashMap;
        import java.util.Map;
public class Solution {
    public static int solution(String n, int b) {
        int w = Integer.parseInt(n);
        int k = 0;
        while (w != 0) {
            k++;
            w /= 10;
        }
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        while (true) {
            if (!map.containsKey(n)) {
                map.put(n, ++i);
                StringBuilder xNum = getXNum(n, k);
                String xNumDecimal = baseConversion(xNum.toString(), b, 10);
                String yNumDecimal = baseConversion(xNum.reverse().toString(), b, 10);
                n = "" + (Integer.parseInt(xNumDecimal) - Integer.parseInt(yNumDecimal));
                n = baseConversion(n, 10, b);
            } else {
                return i - map.get(n) + 1;
            }
        }
    }

    public static String baseConversion(String number, int sBase, int dBase) {
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

    private static StringBuilder getXNum(String n, int k) {
        int arr[] = new int[10];
        for (char x : n.toCharArray()) {
            arr[Character.getNumericValue(x)]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append("" + i);
                k--;
            }
        }
        for (int i = 0; i < k; i++) {
            sb.append("0");
        }
        return sb;
    }
}*/
