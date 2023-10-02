/*Exponential Search Description:it is a searching algorithm that is used to find a specific element
within a sorted array or list.
It works by first identifying a range in which the target element is likely to be located
and then performing a binary search within that range.
Exponential search is particularly useful when dealing with very large data sets or
when the target element is far from the beginning of the array.
for more information:https://en.wikipedia.org/wiki/Exponential_search */


public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        
        // If the target is the first element, return 0
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;// Find the range for binary search
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        // Perform binary search within the found range
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 15, 18, 20};
        int target = 11;
        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

