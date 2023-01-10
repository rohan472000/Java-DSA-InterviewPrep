package Search;

public class search_sorted_rotatedArray {
    public static void main(String[] args) {
        int a[]={20,30,40,50,60,5,10};
        int s = search(a,60);
        System.out.println(s);
    }
    static int search(int a[],int target){
        int low =0;
        int high = a.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if (a[mid]==target){
                return mid;
            }
            // for left side
            if(a[low]<a[mid]){
                if (target>=a[low] && target<a[mid]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            //for right side
            else{
                if (target>a[mid] && target<=a[high])
                {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }

        }return -1;
    }
}
