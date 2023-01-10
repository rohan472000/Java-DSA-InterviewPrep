package Queue;

public class CircularArrayQueue {
    public static void main(String[] args) {

    }
    private static   int[] a;
    private static int n;
    private static int front = -1,rear = -1;
    public  CircularArrayQueue(int n){
        this.n = n;
        a = new int[n];
    }
    static void enqueue(int data){
        if ((rear+1)%n == front) // checking queue is full
          return;
        if (front == -1){
            front = 0;
            rear = (rear+1)%n; // using to increment by 1 , make 0 from -1 , so on...
            a[rear] = data;
        }
    }
    static int dequeue() throws Exception{
        if (front == -1) // checking queue is  empty
            throw new Exception();
        int result =  a[front];
        if (front == rear) // only one element is present
            front = rear = -1; // making them pointing at one element only
        else
            front = (front+1)%n; // use to increment by 1 , here front is increased by 1 .
        return result;
    }
}
