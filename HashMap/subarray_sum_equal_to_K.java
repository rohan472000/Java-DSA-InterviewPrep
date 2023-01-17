package HashMap;

import java.util.HashMap;

public class subarray_sum_equal_to_K {
    public static int subsum(int[] a,int k){
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if (map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int ans = 0;
        int sum =0 ;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if (map.containsKey(sum-k)){
                //System.out.println(sum-k);
                ans+=map.get(sum-k);
            }
            if (map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }
        }
        System.out.println("----------");
        System.out.println(ans);
    }
}
