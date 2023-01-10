package Queue;

public class Queue_byArray {
    int a[];
    int capacity;
    int rear;
    public Queue_byArray(int n){
         capacity = n;
         a = new int[n];
         rear = -1;
    }
    void enqueue(int data) throws Exception {
       if (rear == capacity-1)//overflow
            {
           throw new Exception();
       }
       rear++;
       a[rear] = data;
    }
    int dequeue() throws Exception {
        if (rear == -1) //empty
        {
            throw new Exception();
        }
        int result = a[0];
        for (int i = 0; i < rear ; i++) {
            a[i] = a[i+1];
        }
        rear--;
        return result;
    }
    int getFront() throws Exception {
        if (rear == -1)//empty
        {
            throw new Exception();
        }
        return a[0];
    }
}
