package Day_03;
//www.codeswithpankaj.com
//www.p4n.in
//Node class for doubly linked list
class Node {
 int data;
 Node prev;
 Node next;

 Node(int value) {
     data = value;
     prev = null;
     next = null;
 }
}

//Doubly linked list class
class DoublyLinkedList {
 private Node head;

 DoublyLinkedList() {
     head = null;
 }

 // Function to insert a new node at the beginning of the doubly linked list
 void insertAtBeginning(int value) {
     Node newNode = new Node(value);
     if (head == null) {
         head = newNode;
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 // Function to insert a new node at the end of the doubly linked list
 void insertAtEnd(int value) {
     Node newNode = new Node(value);
     if (head == null) {
         head = newNode;
     } else {
         Node current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newNode;
         newNode.prev = current;
     }
 }

 // Function to display the doubly linked list in forward direction
 void displayForward() {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }

 // Function to display the doubly linked list in reverse direction
 void displayBackward() {
     Node current = head;
     if (current == null) {
         return;
     }
     while (current.next != null) {
         current = current.next;
     }
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.prev;
     }
     System.out.println();
 }
}

//Example usage
public class Doubly_Linked_List {
 public static void main(String[] args) {
     DoublyLinkedList myList = new DoublyLinkedList();

     myList.insertAtEnd(2);
     myList.insertAtEnd(3);
     myList.insertAtBeginning(1);

     myList.displayForward();  // Output: 1 2 3
     myList.displayBackward(); // Output: 3 2 1
 }
}
