// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// return all the pairs that add up to target
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(twoSum(arr, 8));
    }

    public static List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> pairs = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                String pairKey = min + "," + max;

                if (pairs.add(pairKey)) {
                    result.add(Arrays.asList(min, max));
                }
            }

            seen.add(num);
        }

        return result;
    }
}
