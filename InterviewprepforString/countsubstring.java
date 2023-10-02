// Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct)
//  that has exactly k distinct characters. 

// Examples: 

// Input: abc, k = 2
// Output: 2
// Possible substrings are {“ab”, “bc”}

// Input: aba, k = 2
// Output: 3
// Possible substrings are {“ab”, “ba”, “aba”}

public class substring
{
   
  // the number of subarrays with at most K distinct
  // elements
  static int most_k_chars(String s, int k)
  {
    if (s.length() == 0) {
      return 0;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    int num = 0, left = 0;
 
    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i),
              map.getOrDefault(s.charAt(i), 0) + 1);
      while (map.size() > k) {
        map.put(s.charAt(left),
                map.getOrDefault(s.charAt(left), 0)
                - 1);
        if (map.get(s.charAt(left)) == 0) {
          map.remove(s.charAt(left));
        }
        left++;
      }
      num += i - left + 1;
    }
    return num;
  }
  static int exact_k_chars(String s, int k)
  {
    return most_k_chars(s, k) - most_k_chars(s, k - 1);
  }
}
