import java.util.Arrays;

class MergeSort{

    //To merge two sorted arrays
    public static void merge2array(int[] arr,int startIndex,int endIndex){
        int mid = (startIndex+endIndex)/2;
        int i = startIndex;
        int j=mid+1;

        int[] ans = new int[endIndex-startIndex+1];
        int ansIndex = 0;

        while(i<=mid && j<=endIndex){
            if(arr[i]<arr[j]){
                ans[ansIndex++] = arr[i++];
            }else{
                ans[ansIndex++] = arr[j++];
            }
        }

        while(i<=mid){
            ans[ansIndex++] = arr[i++];
        }

        while(j<=endIndex){
            ans[ansIndex++] = arr[j++];
        }

        for (int k = 0; k < ans.length; k++) {
            arr[k+startIndex] = ans[k];
        }

        return;
    }

    public static void mergeSort(int[] arr,int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int mid = (startIndex+endIndex) / 2;
        mergeSort(arr,startIndex,mid);              //Sort first half of array
        mergeSort(arr,mid+1,endIndex);    //Sort second half of array
        merge2array(arr,startIndex,endIndex);       //Merge two sorted arrays
    }

    //Helper function
    public static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,7,6,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}