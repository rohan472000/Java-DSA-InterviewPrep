package sorting;

import static sorting.bubble_sort.swap;

public class Selection_sort {
    public static void main(String[] args) {
        int a[] = {-1,2,3,4,2,2,34,12,-45,0};
        selection(a);

    }
    static void selection(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(a,min,i);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
