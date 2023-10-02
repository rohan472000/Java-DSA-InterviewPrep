
public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {7,6,9,2,5,1};
       for (int i = 1; i < arr.length; i++) {
         int current = arr[i];
         int j = i-1;
         while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
         }
         //place to current position of arr[i]
         arr[j+1] = current;
       }
           printArray(arr);
    }
    public static void printArray(int[] a){
        for (int i : a) {
           System.out.println(i);
        }
   }
}
