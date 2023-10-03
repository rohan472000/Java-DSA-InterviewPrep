/*

A doubly circular linked list in Java is a type of linked list where each node contains a data element and two references: 
one to the next node and another to the previous node. Unlike a singly linked list, where nodes only point to the next node, 
in a doubly circular linked list, the last node points back to the first node, creating a closed loop or circle.

Javapoint : https://www.javatpoint.com/circular-doubly-linked-list# 
*/

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCircularLinkedList {
    private Node head;
    private Node tail;

    public DoublyCircularLinkedList() {
        head = null;
        tail = null;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        tail.next = head;
        head.prev = tail;
    }

    // Display the list
    public void display() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Doubly Circular Linked List:");
        list.display();
    }
}
