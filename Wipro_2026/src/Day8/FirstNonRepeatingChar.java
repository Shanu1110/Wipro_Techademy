package Day8;

import java.util.*;

public class FirstNonRepeatingChar {

    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null; // No non-repeating character found
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeating(input);
        System.out.println("First Non-Repeating Character: " + result);
    }
}
