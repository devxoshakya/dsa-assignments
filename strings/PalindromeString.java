// check if a string is a palindrome
package strings;

public class PalindromeString {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "racecar";
        boolean result = isPalindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + result);
    }
}
