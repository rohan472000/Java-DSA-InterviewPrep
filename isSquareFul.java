import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class isSquareFul {
    public static void main(String[] args) {
        int[] arr = {1,17,8};
        System.out.println(permut(arr));
    }
    private static int count = 0;
    public static int permut(int[] nums){
        //List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null) return count;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<Integer> permutations = new ArrayList<>();
        helper(permutations,nums,used,-1);
        return count;
    }
    private static boolean isSquare(int a, int b){
        double res = Math.sqrt(a+b);
        boolean finalres = (res - Math.floor(res)) == 0;
        return finalres;
    }
    private static void helper(List<Integer> temp, int[] nums, boolean[] used, int lastNumb) {
        if (temp.size() == nums.length) count++;
        else {
            for (int i = 0; i < nums.length; i++) {
                if(used[i]) continue;
                if(lastNumb!=-1){
                    if (isSquare(nums[i],lastNumb)==false)
                        continue;
                }
                used[i] = true;
                temp.add(nums[i]);
                helper(temp,nums,used,lastNumb);
                temp.remove(temp.size()-1);
                used[i] = false;
                while(i+1<nums.length && nums[i] == nums[i+1])
                    ++i;
            }
        }
    }
}
