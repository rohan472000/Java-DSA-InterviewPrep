package LL;
import LL.LL1.*;
public class detect_remove_cycle_LL {
    private static Node head;
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("3");
        list.printall();
        list.head= detect_Node(list.head);
        list.printall();
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
        //System.out.print("nulll");
        System.out.println();
    }
    static Node detect(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                System.out.println("detected");
                return slow;}
        }
        return null;
    }
    static Node detect_Node(Node head){
        Node meet = detect(head);
        System.out.println("after detect");
        Node start = head;
        while(start != meet){
            start = start.next;
            meet = meet.next;
        }return start;
    }

}
