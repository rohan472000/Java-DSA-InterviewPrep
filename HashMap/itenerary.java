package HashMap;

import java.util.HashMap;

public class itenerary {
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revmap = new HashMap<>();
        for (String key:tick.keySet()) {
            revmap.put(tick.get(key),key);
        }
        for (String key: tick.keySet()) {
            if (revmap.containsKey(key))
                return key;
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put( "chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");

        String start = getStart(map);
        // System.out.println(start+"-----");
        while (map.containsKey(start)){
            // System.out.println("-----");
            System.out.println(start);
            start = map.get(start);
        }
        // System.out.println("-------");
        System.out.println(start);
    }
}
