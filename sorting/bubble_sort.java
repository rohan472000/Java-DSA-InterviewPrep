package sorting;

public class bubble_sort  {
    public static void main(String[] args) {
   int a[] = {3,4,2,3,6,7,8,-1};
   bubble(a);
    }
     static void bubble(int a[]){
         for (int i = 0; i < a.length - 1; i++) {
             for (int j = 0; j < a.length-i-1; j++) {
                 if(a[j+1] < a[j]){
                     swap(a,j+1,j);
                 }
             }
         }
         for (int i = 0; i < a.length ; i++) {
             System.out.print(a[i]);
         }
     }
     static void swap(int a[],int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
     }
}
