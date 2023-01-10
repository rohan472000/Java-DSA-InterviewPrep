package Leetcode;

import java.util.HashMap;


public class stringsandPaswords {
    public static void main(String[] args) {
        String a = "password";
        String b = "pss$w#rd";
        String c= "abc123";
        String d = "$abc&123";
        System.out.println(defstring(a,b));
    }

    static int defstring(String oldpass , String newpass){
        int count=0,m=0;
        HashMap<Character,Integer> map = new HashMap<>();
        if (oldpass.length()==newpass.length()){
            for (int i = 0;i < newpass.length();i++){
                char ch = oldpass.charAt(i);
                map.put(ch , map.getOrDefault(ch,0) );
                           }

            for (char c : map.keySet() ) {
                int i =0;
                if (newpass.charAt(i)==c) {
                     i++;
                    continue;
                }
                else {
                    count++;
                  i++;
                }
            }
                    }else {
            return newpass.length()-oldpass.length();
        }


        return count*2;
    }
}
