package Leetcode;

public class SlidingWindowMaximum_Array {
    public static void main(String[] args) {
        int[] a  ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(SlidingWindowMax(a,a.length,k));
    }

    public static int[] SlidingWindowMax(int[] a,int n,int k){
        int max;
        int[] ans = new int[a.length - k + 1];
        for (int i = 0; i < n-k+1 ; i++) {
            max = a[i];
            for (int j = 1; j < k; j++) {
                if(a[i+j] > max)
                    max = a[i+j];
            }
            ans[i] = max;
            System.out.println("m  " +max);
            System.out.println("n  "+ans[i]);
        }
        return ans;
    }
}
/* int n = nums.length;
  if (n == 0 || k == 0) {
    return new int[0];
  }

  int numOfWindow = n - k + 1;
  int[] result = new int[numOfWindow]; // number of windows

  for (int start = 0; start < numOfWindow; ++start) {
    int end = start + k - 1;
    int maxVal = nums[start];
    for (int i = start + 1; i <= end; ++i) {
      if (nums[i] > maxVal) { // update
        maxVal = nums[i];
      }
    }
    result[start] = maxVal;
  }

  return result;*/