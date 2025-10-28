// check if the given string is a substring of another string
package strings;

public class IsSubString {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "defabc";
        System.out.println(isSubString(s1, s2));
    }

    public static boolean isSubString(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() > s2.length()) return false;
        if (s2.contains(s1)) return true;
        else return false;
    }
}
