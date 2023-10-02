import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class hashmap{
    public static void main(String[] args) {
     //System.out.println("hi there");
     HashMap<Integer,Integer> map = new HashMap<>();
     map.put(1, 11);
     map.put(2, 22);
     map.put(3, 33);
     map.put(4, 44); 
     System.out.println(map);
     
     for(Map.Entry<Integer, Integer> e : map.entrySet()){
         System.out.println(e.getKey());
         System.out.println(e.getValue());
     }
     while(!map.isEmpty()){
          map.put(0,map.getOrDefault(0,1));
     }
     }

}