// ques link => https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/     
import java.util.*;
 class MaxValOrderedTriplet {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        maxLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }
        maxRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        }
        long maxTripletValue = 0;
        for (int j = 1; j < n - 1; j++) {
            int leftMax = maxLeft[j - 1];
            int rightMax = maxRight[j + 1];
            maxTripletValue = Math.max(maxTripletValue, (long) (leftMax - nums[j]) * rightMax);
        }
        return maxTripletValue;
    }
    public static void main(String[] args) {
        MaxValOrderedTriplet solution = new MaxValOrderedTriplet();

        int[] nums1 = {12, 6, 1, 2, 7};
        long result1 = solution.maximumTripletValue(nums1);
        System.out.println("Example 1 Result: " + result1); 

        int[] nums2 = {1, 10, 3, 4, 19};
        long result2 = solution.maximumTripletValue(nums2);
        System.out.println("Example 2 Result: " + result2); 
    }
}
