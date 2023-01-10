package LL;
import LL.LL1.*;

public class palindrome_LL {
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("4");
        list.addFirst("1");
        list.addFirst("4");
        System.out.println(palindrome(list.head));
        list.printall();
    }
    static  Node middle(Node head){
        Node slow  = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static boolean palindrome(Node head){
        if (head == null)
            return true;
        Node mid = middle(head);
        Node last = LL1.reverse(mid.next);
        Node curr = head;
        while (last != null){
            if (last.data != curr.data)
                return false;
            last = last.next;
            curr = curr.next;
        }return true;
    }


}
