// Implementation of getting the frequency of the array elements !
package arrays;

import java.util.HashMap;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5 };

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int e : arr) {
            freq.put(e, freq.getOrDefault(e, 0) + 1);
        }

        System.out.println("Frequency of array elements : " + freq);
    }
}
