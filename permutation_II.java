import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_II {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(permutunique(arr));
    }
    public static List<List<Integer>> permutunique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null)
            return res;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<Integer> permutations = new ArrayList<>();
        helper(nums,permutations,used,res);
        return res;
    }
    public  static void helper(int[] nums, List<Integer> permutations, boolean[] used,List<List<Integer>> res){
        if(permutations.size() == nums.length){
            res.add(new ArrayList<>(permutations));
            return;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;
                used[i] = true;
                permutations.add(nums[i]);
                helper(nums,permutations,used,res);
                permutations.remove(permutations.size() - 1);
                used[i] = false;
                while(i+1<nums.length && nums[i] == nums[i+1])
                    ++i;
            }
        }
    }

}
