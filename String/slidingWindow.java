// Given two strings, string, and pattern, the task is to find the smallest substring in string containing all characters of pattern. 

// Examples: 

// Input: string = “this is a test string”, pattern = “tist” 
// Output: “t stri” 
// Explanation: “t stri” contains all the characters of pattern.

public class SubstringContainingPattern {
    // Function to check if the substring contains all
    // characters of the pattern
    static boolean containsAllCharacters(String substr, String pattern) {
        int[] count = new int[256];
 
        // Count the frequency of each character in the pattern
        for (char ch : pattern.toCharArray())
            count[ch]++;
 
        // For each character in the substring, decrement its
        // count
        for (char ch : substr.toCharArray()) {
            if (count[ch] > 0)
                count[ch]--;
        }
 
        // If all counts in the count array are zero, the
        // substring contains all characters of the pattern
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0)
                return false;
        }
 
        return true;
    }
    static String findSmallestSubstring(String str, String pattern) {
        int lenStr = str.length();
        int lenPattern = pattern.length();
        String smallestSubstring = "";
 
        int minLength = Integer.MAX_VALUE;
 
        // Generate all substrings of the given string
        for (int i = 0; i < lenStr; i++) {
            for (int j = i; j < lenStr; j++) {
                String substr = str.substring(i, j + 1);
 
                // Check if the substring contains all
                // characters of the pattern
                if (containsAllCharacters(substr, pattern)) {
                    int currentLength = substr.length();
 
                    // Update the smallestSubstring if the
                    // current substring is smaller
                    if (currentLength < minLength) {
                        minLength = currentLength;
                        smallestSubstring = substr;
                    }
                }
            }
        }
 
        return smallestSubstring;
    }
}