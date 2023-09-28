import java.util.Arrays;
import java.util.Random;

/**
 * Utility for comparing the runtime of various sorting algorithms.
 * Part of 6.3DN Sorting Algorithms.
 * 
 * @author Ibrahim Hossain Limon
 * @version 23 Aug 2023
 */
public class SortTiming {
    /** Supported algorithms */
    public enum Alg { BUBBLE, SELECT, INSERT, QUICK };

    /** The random number generator. */
    private Random rand;

    /** Create a new SortTiming object with the random number generator initialised with seed. */
    public SortTiming(long seed) {
        rand = new Random(seed);
    }

    /** Reset the random number generator with the given random seed. */
    public void setSeed(long seed) { rand.setSeed(seed); }

    /** Generates an array of size elements randomly initialised between lo and hi, inclusive. */
    private int[] randomlyInitArray(final int size, final int lo, final int hi) {
        final int range = hi - lo + 1;
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = rand.nextInt(range) + lo;
        }

        return a;
    }
    
    /** Initialise an array of size elements containing the values [1, 2, ... size]. */
    private int[] sequentiallyInitArray(final int size) {
        int[] a = new int[size];
        
        for (int i = 0; i < size; i++) {
            a[i] = i + 1;
        }
        
        return a;
    }

    /** Compares all supported sorting algorithms on randomised data in range [lo, hi]. */
    public void compareSortsOnRandom(final int size, final int lo, final int hi, boolean displayAfter) {
        compareSorts( randomlyInitArray(size, lo, hi), displayAfter );
    }
    
    /** Compares all supported sorting algorithms on sequential data. */
    public void compareSortsOnSorted(final int size, boolean displayAfter) {
        compareSorts( sequentiallyInitArray(size), displayAfter );
    }

    /**
     * Compares all supported sorting algorithms on the given array of integers, optionally
     * displaying their results after to confirm they all achieve the same outcome.
     */
    public void compareSorts(int[] data, boolean displayAfter) {
        long bubbleTime, selectTime, insertTime, quickTime;
        int[] bubbleSorted = Arrays.copyOf(data, data.length);
        int[] selectSorted = Arrays.copyOf(data, data.length);
        int[] insertSorted = Arrays.copyOf(data, data.length);
        int[] quickSorted = Arrays.copyOf(data, data.length);

        ArrayRoutines.setTracing(false);

        System.out.print("\nSorting " + data.length + " items to compare sorting algorithm performance...");
        bubbleTime = timeSort(bubbleSorted, Alg.BUBBLE);
        selectTime = timeSort(selectSorted, Alg.SELECT);
        insertTime = timeSort(insertSorted, Alg.INSERT);
        quickTime = timeSort(quickSorted, Alg.QUICK);
        System.out.println("done");

        if (displayAfter) {
            System.out.println("Original data");
            ArrayRoutines.display(data);
            //Use own display so can present them simultaneously
            System.out.println("Data sorted by\nBubble\nSelection\tInsertion\tQuick");
            display(bubbleSorted, insertSorted, selectSorted, quickSorted);
            System.out.println();
        }

        System.out.println("Time to sort " + data.length + " elements");
        displayTime("Bubble Sort:             ", bubbleTime);
        displayTime("Selection sort:          ", selectTime);
        displayTime("Insertion sort:          ", insertTime);
        displayTime("java.util.Arrays.sort(): ", quickTime);
    }

    /** Displays the given time formatted as milliseconds, seconds and minutes. */
    private void displayTime(String prefix, long time) {
        System.out.println(String.format("%s%d ms\tor\t%2.1f s\tor\t%2.1f min",
                            prefix, time, time/1000.0, time/60000.0));
    }

    /** Displays the contents of 0 or more arrays (of the same length) side by side. */
    public void display(int[]... data) {
        final String LINE_END = System.lineSeparator();
        //Will fail if data arrays do not all have the same length
        for (int i = 0, c = data[0].length; i < c; i++) {
            for (int which = 0; which < data.length; which++) {
                System.out.print(data[which][i] + (which < data.length - 1 ? "\t" : LINE_END));
            }
        }
    }

    /** Returns how long it took to sort the array data using the named algorithm. */
    public long timeSort(int[] data, Alg alg) {
        long start = System.currentTimeMillis();

        switch (alg) {
            case BUBBLE: ArrayRoutines.bubbleSort(data);
            case INSERT: ArrayRoutines.insertionSort(data);
            case SELECT: ArrayRoutines.selectionSort(data);
            case QUICK: Arrays.sort(data);
        }

        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        final int LBOUND = 0, UBOUND = 1000;
        final int SIZE = 100000;
        SortTiming tester = new SortTiming(1);

        tester.compareSortsOnRandom(SIZE, LBOUND, UBOUND, false);
        System.out.println();
        tester.compareSortsOnSorted(SIZE, false);
    }

}
