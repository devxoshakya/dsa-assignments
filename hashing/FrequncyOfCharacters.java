package hashing;

import java.util.HashMap;

public class FrequncyOfCharacters {

    public static void main(String[] args) {
            String str = "aaabcb";
            HashMap<Character,Integer> freq = new HashMap<>();
            for(char ch : str.toCharArray()){
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
            System.out.println("Frequency of characters: " + freq);
    }
}
