package Leetcode;

public class TwoSum {

//    public static int[] twosum(int a[], int target){
//        int[] res = new int[7];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i+1; j < a.length; j++) {
//                if(a[i]+a[j] == target)
//                {
//                    System.out.println(new int[]{i,j});
//                    return new int[]{i,j};}
//            }
//        }
//
//        throw new IllegalArgumentException("no");
//    }
public static int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            int comp = target - nums[i];

            if(comp == nums[j]){
                return new int[]{i,j};
                // if(nums[i]+nums[j] == target) return new int[]{i,j};
            }
        }
    }
    throw new IllegalArgumentException("no");

}
    public static void main(String[] args) {
       int[] nums = {2,7,5,1,1};
       twoSum(nums,9);

    }
}
