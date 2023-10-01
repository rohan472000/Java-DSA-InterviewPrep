
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {3,2,4,9,1,5};
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] a){
        for (int i : a) {
           System.out.println(i);
        }
   }
}
