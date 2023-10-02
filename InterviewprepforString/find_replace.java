// Given three strings S, S1, and S2 consisting of N, M, and K characters respectively, the task is to modify the string S by replacing all the substrings S1 with the string S2 in the string S.

// Examples:

// Input: S = “abababa”, S1 = “aba”, S2 = “a”
// Output: aba
// Explanation:
// Change the substrings S[0, 2] and S[4, 6](= S1) to the string S2(= “a”)
// modifies the string S to “aba”. Therefore, print “aba”.
class GFG {
 // Function to replace all the occurrences
  // of the subString S1 to S2 in String S
  static void modifyString(String s, String s1, String s2)
  {
    // Stores the resultant String
    String ans = "";
 
    // Traverse the String s
    for (int i = 0; i < s.length(); i++) {
 
      int k = 0;
 
      // If the first character of
      // String s1 matches with the
      // current character in String s
      if (s.charAt(i) == s1.charAt(k)
          && i + s1.length() <= s.length()) {
 
        int j;
 
        // If the complete String
        // matches or not
        for (j = i; j < i + s1.length(); j++) {
 
          if (s.charAt(j) != s1.charAt(k)) {
            break;
          }
          else {
            k = k + 1;
          }
        }
         if (j == i + s1.length()) {
          ans += (s2);
          i = j - 1;
        }
 
        // Otherwise
        else {
          ans += (s.charAt(i));
        }
      }
 
      // Otherwise
      else {
        ans += (s.charAt(i));
      }
    }
 
    // Print the resultant String
    System.out.print(ans);
  }
}