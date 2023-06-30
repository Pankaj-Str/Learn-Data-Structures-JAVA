package Day_04;
//www.codeswithpankaj.com
//www.p4n.in
//Node class for circular linked list
class Node {
 int data;
 Node next;

 Node(int value) {
     data = value;
     next = null;
 }
}

//Circular linked list class
class CircularLinkedList {
 private Node head;

 CircularLinkedList() {
     head = null;
 }

 // Function to insert a new node at the beginning of the circular linked list
 void insertAtBeginning(int value) {
     Node newNode = new Node(value);
     if (head == null) {
         newNode.next = newNode; // Point to itself in a circular list
     } else {
         Node current = head;
         while (current.next != head) {
             current = current.next;
         }
         current.next = newNode;
         newNode.next = head;
     }
     head = newNode; // Update the head to the new node
 }

 // Function to insert a new node at the end of the circular linked list
 void insertAtEnd(int value) {
     Node newNode = new Node(value);
     if (head == null) {
         newNode.next = newNode; // Point to itself in a circular list
         head = newNode; // Update the head to the new node
     } else {
         Node current = head;
         while (current.next != head) {
             current = current.next;
         }
         current.next = newNode;
         newNode.next = head;
     }
 }

 // Function to display the circular linked list
 void display() {
     if (head == null) {
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

//Example usage
public class Circular_Linked_List{
 public static void main(String[] args) {
     CircularLinkedList myList = new CircularLinkedList();

     myList.insertAtEnd(2);
     myList.insertAtEnd(3);
     myList.insertAtBeginning(1);

     myList.display(); // Output: 1 2 3
 }
}
