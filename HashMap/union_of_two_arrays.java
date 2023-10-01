package HashMap;

import java.util.HashSet;

public class union_of_two_arrays {
    public static int printUnion(int[] a,int[] b){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        System.out.println(set); // print all elements present in hashset
        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,1,5,1};
        int[] nums1 = {9,5,5,8};
        System.out.println(printUnion(nums,nums1));
    }
}
