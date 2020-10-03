import java.io.IOException;
import java.util.Arrays;

/*Problem Statement:-

        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
public class DCP_1 {
    public static void main(String[] args) throws IOException {
        int arr[] = {1,2,3,4,5};
        int mul = 1;
        for (int x: arr){
            mul*=x;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = mul/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
