package Queue;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {

    }
    private Stack<Integer> first;
    private Stack<Integer> second;
     public QueueUsingStacks(){
         first = new Stack<>();
         second = new Stack<>();
     }
     public void add(int item){
         first.push(item);
     }
     public  int remove(){
         while (!first.isEmpty()){
             second.push(first.pop());
         }
         int removed = second.pop();

         while (!second.isEmpty()){
             first.push(second.pop());
         }
         return removed;
     }

     public boolean isEmpty(){
         return first.isEmpty();
     }

     public void efficientAdd(int item) throws Exception{
         while (!first.isEmpty()){
             second.push(first.pop());
         }
         first.push(item);
         while(!second.isEmpty())
             first.push(second.pop());
     }
     public int efficientPeek() throws Exception{
         return first.peek();
     }
     public int peek() throws Exception{
         while (!first.isEmpty()){
             second.push(first.pop());
         }
         int peek = second.peek();

         while (!second.isEmpty()){
             first.push(second.pop());
         }
         return peek;
     }
}
