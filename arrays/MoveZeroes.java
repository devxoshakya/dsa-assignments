// given a array move all the zeroes to the right and keep the relative order of non-zero elements
package arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println(
            "After Moving Zeroes : " + Arrays.toString(moveZeroes(arr))
        );
    }

    private static int[] moveZeroes(int arr[]) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }
}
