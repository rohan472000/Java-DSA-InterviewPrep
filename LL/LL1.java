package LL;

public class LL1 {
    Node head;
    private  int size;
    LL1(){
        this.size = 0;
    }
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("a");
        list.addFirst("ab");
        list.addLast("zzzz");
        list.printall();

        //list.deleteFirst();
        //list.printall();

        //System.out.println(list.getSize());

        list.head = list.reverse(list.head);
        list.printall();
    }
    public static Node reverse(Node head){
        if (head == null || head.next==null)
            return head;
        Node newHead  = reverse(head.next);
        head.next.next = head;
        head.next  = null;

        return  newHead;
        /*Node current = head;
        Node previous = null;
        Node next = null;

        while(current != null){
            next  = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
            return previous;*/

    }
    public int getSize(){

        return size;
    }
    public void deleteFirst(){
        if (head == null){
            System.out.print("list is empty");
            return;
        }
        size--;
        head = head.next;

    }
    public void deleteLast(){
        if (head == null){
            System.out.print("list is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        //Node head = null;
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printall(){
        if (head == null){
            System.out.print("no list");
        }
        Node currNode= head;
        while (currNode != null){
            System.out.print(currNode.data+"-->");
            currNode  =currNode.next;
        }
        System.out.print("nulll");
        System.out.println();
    }
    public void addFirst(String data){
        Node newNode  = new Node(data);
        //Node head = null;
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = next;
            size++;
        }
    }
}
