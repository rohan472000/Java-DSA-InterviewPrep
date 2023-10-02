import java.util.HashMap;
import java.util.Map;

public class remove_adjacent_duplicates {
    public static void main(String[] args) {
        String s = "pbbcggttciiippooaais";
        System.out.println(removeDuplicates(s, 2));
    }

    public static String removeDuplicates(String s, int k) {
//        Map<Character, Integer> map = new HashMap<>();
//        String finalres ="";
//        char[] charr = s.toCharArray();
//        for (Character c : charr) {
//            map.put(c, map.getOrDefault(c, 0)+1);
//        }
//        for (Map.Entry<Character, Integer> e : map.entrySet()) {
////            for (int i = 0; i < e.getValue(); i++) {
////                System.out.println(e + " --" + i);
////            }
////           if(e.getValue() != k ){
////               for (int i = 0; i < e.getValue() ; i++) {
////                   finalres+=e.getKey();
////               }
////          }
//            finalres+=e.getKey();
//        }
//        return finalres;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else count = 1;

            if (count == k) {
                String reduce = s.substring(0, i - k + 1) + s.substring(i + 1);
                return removeDuplicates(reduce, k);
            }
        }return s;
    }
}
