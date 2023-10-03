// Given an array of words, print all anagrams together. 
// For example, if the given array is {“cat”, “dog”, “tac”, “god”, “act”}, 
// then output may be “cat tac act dog god”.
//  Create two auxiliary arrays index[] and words[]. Copy all given words to words[]
//   and store the original indexes in index[] 

// index[]:  0   1   2   3   4
// words[]: cat dog tac god act
public class FindAnagrams {
 
    private static void printAnagrams(String arr[])
    {
        HashMap<String, List<String> > map
            = new HashMap<>();
 
        // loop over all words
        for (int i = 0; i < arr.length; i++) {
 
            // convert to char array, sort and
            // then re-convert to string
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
 
            // calculate hashcode of string
            // after sorting
            if (map.containsKey(newWord)) {
 
                map.get(newWord).add(word);
            }
            else {
 
                // This is the first time we are
                // adding a word for a specific
                // hashcode
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
              for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
    }
}
