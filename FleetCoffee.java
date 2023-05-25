import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static String firstNonRepeated(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return String.valueOf(c);
            }
        }

        // No non-repeated character found
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("hello"));  // Output: h
        System.out.println(firstNonRepeated("aabcc"));  // Output: b
        System.out.println(firstNonRepeated("aabbcc")); // Output: ""
    }
}
