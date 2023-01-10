package Priority_Queue;

import java.util.PriorityQueue;

public class Kth_largest_element {
    public static void main(String[] args) {
        int a[] = {3,2,4,5,61,12};

        System.out.println(largest(a,3));
    }
    public  static int largest(int a[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(a[i]);
        }
        for (int i = k; i < a.length; i++) {
            if (pq.peek() < a[i]){
                pq.remove();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }
}
