package Day_05;
//www.codeswithpankaj.com
//www.p4n.in

import java.util.EmptyStackException;

//Node class for stack
class Node {
 int data;
 Node next;

 Node(int value) {
     data = value;
     next = null;
 }
}

//Stack class
class Stack {
 private Node top; // Reference to the top node of the stack

 public Stack() {
     top = null; // Stack is initially empty
 }

 public void push(int value) {
     Node newNode = new Node(value);
     newNode.next = top;
     top = newNode;
 }

 public int pop() {
     if (isEmpty()) {
         throw new EmptyStackException();
     }
     int value = top.data;
     top = top.next;
     return value;
 }

 public int peek() {
     if (isEmpty()) {
         throw new EmptyStackException();
     }
     return top.data;
 }

 public boolean isEmpty() {
     return top == null;
 }
}

//Example usage
public class Stack_Example {
 public static void main(String[] args) {
     Stack stack = new Stack();

     stack.push(1);
     stack.push(2);
     stack.push(3);

     System.out.println(stack.pop()); // Output: 3
     System.out.println(stack.peek()); // Output: 2
     System.out.println(stack.isEmpty()); // Output: false

     stack.push(4);
     stack.push(5);

     System.out.println(stack.pop()); // Output: 5
     System.out.println(stack.pop()); // Output: 4
     System.out.println(stack.pop()); // Output: 2
     System.out.println(stack.isEmpty()); // Output: true

     // Trying to pop from an empty stack
     try {
         System.out.println(stack.pop());
     } catch (EmptyStackException e) {
         System.out.println("Error: " + e.getMessage()); // Output: Error: java.util.EmptyStackException
     }
 }
}
