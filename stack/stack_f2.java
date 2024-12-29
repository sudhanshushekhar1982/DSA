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
        }
        //pop operation
        // peek operation
    }
    public static void main(String[] args) {

    }
}
