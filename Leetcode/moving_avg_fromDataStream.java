package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class moving_avg_fromDataStream {
    public static void main(String[] args) {
        moving_avg_fromDataStream obj = new moving_avg_fromDataStream(3);
        double m = obj.next(4);
        double n = obj.next(4);
        double w = obj.next(4);double y = obj.next(0);

    }
    private static Queue<Integer> queue;
    private static int maxsize;
    private static  double sum;
     public  moving_avg_fromDataStream(int size){
         queue = new LinkedList<>();
         maxsize  = size;
         sum = 0;
     }
     public static  double next(int val){
         if (queue.size() == maxsize){
             sum -= queue.remove();
         }
         queue.add(val);
         sum += val;
         System.out.println(sum/queue.size());
         return sum/queue.size();
     }
}
