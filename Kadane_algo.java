/*
* maximum continuos sub-array
* */
class Solution {
    public static int maxSubArray(int[] nums) {
        int cs = nums[0]; // Start with the first element for case of all negative elements


        int ms = nums[0]; // Initialize max sum with the first element 

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]); 
            ms = Math.max(cs, ms); 
        }

        return ms;
    }

    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
