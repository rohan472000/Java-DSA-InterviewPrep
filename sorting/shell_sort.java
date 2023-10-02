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
