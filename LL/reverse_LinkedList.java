package LL;

public class reverse_LinkedList {
    private int size;
    class Node{
        String data;
        Node next;
          Node(String data){
             this.data = data;
             this.next = next;
             size++;
         }
    }
    Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        if(head == null && head.next == null)
            return true;

        Node mid = middle(head);
        Node last = reverse(mid);
        Node curr = head;
        while( last != null){
            if(last.data != curr.data)
            { return false;}
            else{last = last.next;
                curr = curr.next;}
        }return true;

    }
    public Node reverseRecursion(Node head){
        if(head == null || head.next == null)
            return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public Node middle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
