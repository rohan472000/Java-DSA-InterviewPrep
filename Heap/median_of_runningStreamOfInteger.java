package Heap;
import java.util.*;

public class median_of_runningStreamOfInteger {
    public static void main(String[] args) {
        median_of_runningStreamOfInteger obj = new median_of_runningStreamOfInteger();
        obj.insertNum(3);
        obj.insertNum(1);
        System.out.println(median());
        obj.insertNum(5);
        System.out.println(median());
    }
   public  static PriorityQueue<Integer> maxHeap  = new PriorityQueue<>(Collections.reverseOrder());
   public  static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

   public static void insertNum(int num){
        if (maxHeap.isEmpty() || maxHeap.peek() >= num)
            maxHeap.add(num);
        else
            minHeap.add(num);

        if (maxHeap.size() > minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    public  static  double median(){
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek()+ minHeap.peek())/2;
        return maxHeap.peek();
    }
}
