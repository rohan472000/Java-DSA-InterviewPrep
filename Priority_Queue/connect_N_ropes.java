package Priority_Queue;

import java.util.PriorityQueue;

public class connect_N_ropes {
    public static void main(String[] args) {
        int a[] = {2,5,4,8,6,9};
        System.out.println(minCost(a));
    }
    public static  int minCost(int a[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            pq.add(a[i]);
        }
        int ans = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = 0;
            sum = first + second;
            ans = ans + sum;
        }
        return ans;
    }
}
