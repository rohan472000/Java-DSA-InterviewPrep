public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,9,4};

        //bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int[] a){
         for (int i : a) {
            System.out.println(i);
         }
    }
    
}
