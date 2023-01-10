package sorting;

import javax.swing.plaf.synth.SynthTextAreaUI;

import static sorting.bubble_sort.swap;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {3,1,2,67,34,-1};
        quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.print("-------------------------------------------------");
        System.out.println();
        quick(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
    static void quickSort(int a[],int low , int high){
        if (low < high){
            int j = partition(a,low , high);
            System.out.println(j);
            quickSort(a,low,j-1);
            quickSort(a,j+1,high);
        }

    }
    static void quick(int a[] , int low, int high){
        int j = partition_middle(a,low ,high);

        if (low < j-1){
            quick(a,low,j-1);

        }
        if (j < high){
            quick(a,j,high);
        }
    }
    static int partition_one(int a[], int low , int high){
        /*int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j){
            do{
                i++;
            }while(a[i] <= pivot);
            do {
                j--;
            }while(a[j] > pivot);
            if (i < j){
            swap(a,a[i],a[j]);}
        }
        swap(a,low,j);
        System.out.println(j);
        return j; */
    return 2;
    }
    static int partition_middle(int a[], int low, int high){
        int pivot = (low + high)/2;
        while( low <= high){
            if(a[low] < a[pivot]){
                low++;
            }
            if(a[high] > a[pivot]){
                high--;
            }
            if(low <= high){
                swap(a,a[low],a[high]);
                low++;
                high--;
            }
        }
        return low;
    }
        static int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low-1); // index of smaller element
            for (int j=low; j<high; j++)
            {
                // If current element is smaller than or
                // equal to pivot
                if (arr[j] <= pivot)
                {
                    i++;

                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // swap arr[i+1] and arr[high] (or pivot)
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            return i+1;
        }

    }

