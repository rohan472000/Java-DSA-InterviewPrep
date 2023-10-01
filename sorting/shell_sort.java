/* This class demonstrates a Shell Sort algorithm.
Description:
Shell Sort is an efficient and adaptive sorting algorithm that is an extension of the Insertion Sort algorithm.
It works by dividing the array into smaller subarrays and then sorting these subarrays using the Insertion Sort method. 
The key idea behind Shell Sort is to compare and swap elements that are far apart, gradually reducing the gap between elements until the entire array is sorted.
Basic Steps:
1.Choose a gap sequence (commonly, it starts with n/2 where n is the length of the array) to determine the initial gap.
2.Divide the array into subarrays of elements separated by the chosen gap.
3.Apply Insertion Sort to each subarray independently to sort the elements within the subarray.
4.Reduce the gap between elements and repeat steps 2 and 3 until the gap becomes 1.
5.Finally, apply Insertion Sort with a gap of 1 to perform the final sorting, which is usually efficient because the array has been partially sorted by the previous steps.
Shell Sort is known for its adaptive nature, as the choice of gap sequence can significantly affect its performance. 
It has a time complexity that depends on the gap sequence used but often exhibits a better average-case performance compared to the simple Insertion Sort.
* For more information, see:https://en.wikipedia.org/wiki/Shellsort */

public class shell_sort {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //The gap is reduced using the expression gap /= 2 
            //in the outer loop
            
            for (int i = gap; i < n; i++) {// Perform an insertion sort for elements at each gap
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Original array:");
        printArray(arr);

        shellSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
