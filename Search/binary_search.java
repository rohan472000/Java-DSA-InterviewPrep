package Search;

public class binary_search {
    public static void main(String[] args) {
        int a[] = {1,2,3,6,78,89};
        System.out.println(search(a,89));
    }
    static int search(int a[],int target) {

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == a[mid]) {
                return mid;
            }
            if (target > a[mid]) {
                low = mid + 1;
            }
            if (target < a[mid]) {
                high = mid - 1;
            }

        }return -1;
    }
}
