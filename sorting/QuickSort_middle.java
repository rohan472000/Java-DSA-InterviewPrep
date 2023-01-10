package sorting;

import static sorting.bubble_sort.swap;

public class QuickSort_middle {
    public static void main(String[] args) {
        int a[] = {3,1,2,67,34,-1};

        System.out.print("-------------------------------------------------");
        System.out.println();
        quick(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }

    static void quick(int a[] , int low, int high){
       if (low < high) {
           int j = partition_middle(a, low, high);
           quick(a, low, j - 1);
           quick(a, j, high);
       }
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
                int  temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }


    }

