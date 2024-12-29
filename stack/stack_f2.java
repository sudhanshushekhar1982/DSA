package stack;

import java.lang.*;
import java.util.*;
public class stack_f2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        //isEmpty function
        public static boolean isEmpty() {
            return head == null;
        }

        //push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop operation
        public static int pop() {
            if(isEmpty()) {
                System.out.println("the given stack is empty");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek operation
        public static int peek() {
            if(isEmpty()) {
                System.out.println("the given stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println("value "+s.peek()+" is peeked.");
            s.pop();
        }
    }
}
