// reverse a string 

package strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Can you reverse me?";
        String reversed = reverse(str);
        System.out.println(reversed);
    }
    
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}