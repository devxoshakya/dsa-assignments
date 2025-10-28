// Implement the rotateArray method to rotate an array by k positions to the right.
package arrays;

import java.util.Arrays;

public class RotationsOfArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2; // rotate right 2 times
        System.out.println("Original Array :" + Arrays.toString(arr));
        System.out.println("Rotated Array :" + Arrays.toString(rotateArray(arr, k)));
    }

    private static int[] rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        return rotated;
    }
}
