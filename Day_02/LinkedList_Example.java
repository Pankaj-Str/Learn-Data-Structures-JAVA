package Day_02;
//www.codeswithpankaj.com
//www.p4n.in
//Node class for linked list
class Node {
 int data;
 Node next;

 Node(int value) {
     data = value;
     next = null;
 }
}

//Linked list class
class LinkedList {
 private Node head;

 LinkedList() {
     head = null;
 }

 // Function to insert a new node at the beginning of the linked list
 void insertAtBeginning(int value) {
     Node newNode = new Node(value);
     newNode.next = head;
     head = newNode;
 }

 // Function to insert a new node at the end of the linked list
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
     }
 }

 // Function to display the linked list
 void display() {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }
}

//Example usage
public class LinkedList_Example {
 public static void main(String[] args) {
     LinkedList myList = new LinkedList();

     myList.insertAtBeginning(3);
     myList.insertAtBeginning(2);
     myList.insertAtEnd(4);

     myList.display(); // Output: 2 3 4
 }
}
