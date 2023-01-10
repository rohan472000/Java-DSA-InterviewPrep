package Search;

public class binarySearch2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,6,78,89}; // should be infinite sorted array
        System.out.println(search2(a,89));
    }
    static int search2(int a[],int target){
        int low=0;
        int high=1;
        while (a[high] < target){
            low  = high;
            high = 2*high;
        }
        return search(a,target,low,high);
    }
    static int search(int a[],int target,int low,int high){
        while(low < high){
            int mid = (low+high)/2;
            if(a[mid] == target){
                return mid;
            }
            if (a[mid] < target){
                low = mid+1;
            }
            if (a[mid] > target){
                high = mid-1;
            }
        }return -1;
    }
}
