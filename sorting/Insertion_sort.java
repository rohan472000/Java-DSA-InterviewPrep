package sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int a[] = {-1,2,3,4,2,2,34,12,-45,0};
        insertion(a);
    }
    static void insertion(int a[]){
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i-1;
            while (j >= 0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
