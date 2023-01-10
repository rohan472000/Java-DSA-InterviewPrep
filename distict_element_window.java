import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class distict_element_window {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> disinct(int a[],int window){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int x:a) {
            hs.add(x);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < i+4; j++) {

            }
        }
        return list;
    }
}
