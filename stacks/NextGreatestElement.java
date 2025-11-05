import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (!st.isEmpty()) ans[i] = st.peek();
            st.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        int[] res = nextGreaterElements(nums);

        for (int x : res) System.out.print(x + " ");
    }
}