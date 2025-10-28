// Implement the reversal of an array.
package arrays;
import java.util.Arrays;

public class ReversalArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,67,90,7,6,5};
        System.out.println("Original Array :" + Arrays.toString(arr));
        System.out.println("Reversed Array:" + Arrays.toString(reverseArray(arr)));
    }
    
    private static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr; 
    }
}