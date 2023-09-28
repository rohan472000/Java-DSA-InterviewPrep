/**
 * Sorting algorithms copied from ArrayRoutines with tracing statements
 * commented out to make the comparison with in-built sorting methods a
 * _little_ more fair (there are still other optimisations that should be
 * made to ensure we are comparing algorithmic differences, not implementation
 * differences)
 */
public class ArrayRoutines {

    private static boolean tracing = true;

    // Searching and sorting functions
    
    /**
     * Performs a linear search for the location of a value in the array; returns
     * -1 if it is not present. See, e.g.,
     * <a href="https://en.wikipedia.org/wiki/Linear_search">the Wikipedia article</a>.
     * @param data  the array to search
     * @param target  the target to search for
     * @return the position of target in data, or -1 if not found
     */
    public static int linearSearch(int[] data, int target) {
        boolean found = false;
        int index = -1;
        int counter = 0;
        
        while (counter < data.length && !found) {
            if (data[counter] == target) {
//                trace("found at " + counter);
                found = true;
                index = counter;
            } else {
                counter++;
//                trace("moving on to " + counter);
            }
        }
        return index;
    }
    
    /**
     * Performs a binary search to find the position of the value t; returns -1 if
     * it is not in the array. See, e.g.,
     * <a href="https://en.wikipedia.org/wiki/Binary_search">the Wikipedia article</a>.
     * @param data  the array to search
     * @param target  the target value to find
     * @return the position of target in data, or -1 if not found
     */
    public static int binarySearch(int[] data, int target) {
        boolean found = false;
        int low = 0;
        int high = data.length - 1;
        int middle;
        int index = -1;
        
        while (low <= high && !found) {
            middle = (low + high)/2;
//            trace("searching from " + low + " to " + high);
//            trace("middle is " + middle);
            if (data[middle] == target) {
//                trace("found at " + middle);
                found = true;
                index = middle;
            } else {
//                trace("search moving on");
                if (target < data[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
        
        return index;
    }
    
    /**
     * Sorts the array into ascending order using insertion sort. See, e.g.,
     * <a href="https://en.wikipedia.org/wiki/Insertion_sort">the Wikipedia
     * article</a>.
     * @param data  the array to sort
     */
    public static void insertionSort(int[] data) {
        int key; //value to "insert"
        int position; //where to "insert"
        
        for (int index = 1; index < data.length; index++) {
            key = data[index];
//            trace("find position for " + key);
            position = index;
            // shift larger values to the right
            while (position > 0 && data[position-1] > key) {
//                trace("move element along");
                data[position] = data[position-1];
                position--;
            }
//            trace("placing at " + position);
            data[position] = key;
        }
    }
   
    /**
     * Sorts the array into ascending order using selection sort. See, e.g.,
     * <a href="https://en.wikipedia.org/wiki/Selection_sort">the Wikipedia
     * article</a>.
     * @param data  the array to sort
     */
    public static void selectionSort(int[] data) {
        int min, temp;
        
        for (int index = 0; index < data.length-1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan] < data[min]) {
                    min = scan;
                }
            }
            //swap the values
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }

    /**
     * Sorts the array into ascending order using Bubble Sort.
     */
    public static void bubbleSort(int[] data){
        int temp;
        for(int i=data.length-1; i>=0; i--){
            for(int j=0;j<i;j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    
    // General utitility functions for displaying and using arrays
    
    /**
     * Displays the values stored in an array of ints
     * @param a  the array
     */
    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("element " + i + ": " + a[i]); //<-- the formatting is up to you
        }
    }
    
    //Other methods from ArrayRoutines not copied across

    /**
     * Prints a tracing message (prefixed by 'ArrayRoutines: ') if tracing is
     * enabled.
     * @param message  the tracing message
     */
    public static void trace(String message) {
        if(tracing) {
            System.out.println("ArrayRoutines: " + message);
        }
    }

    /** Enables or disables tracing. */
    public static void setTracing(boolean on) {
        tracing = on;
    }

}
