/*

A circular linked list is a data structure in Java where the last node of the list points back to the first node, 
forming a closed loop or circle. Circular linked lists have some advantages, such as constant-time insertion, 
deletion at both the beginning and end of the list. They are useful for applications that require continuous looping, 
like managing tasks in a round-robin scheduling algorithm.

Wikipedia : https://en.wikipedia.org/wiki/Linked_list#Circular_linked_list

*/

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;
    public CircularLinkedList() {
        head = null;
    }

    // Add a new node to the end of the circular linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Make it circular
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(1);
        cll.append(2);
        cll.append(3);
        cll.append(4);

        System.out.println("Circular Linked List:");
        cll.display();
    }
}
