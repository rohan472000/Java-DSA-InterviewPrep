package Queue;

public class queue_byLinkedlist {
    public static void main(String[] args) {

    }
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public class Queue{
        Node front,rear;
        void enqueue(int data){
            Node newNode = new Node(data);
        if (front == null ){
            front=rear=newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        }

        int dequeue() throws Exception {
            if (front == null){
                throw new Exception();
            }
            int result = front.data;
            front = front.next;
            return result;
        }
    }

}
