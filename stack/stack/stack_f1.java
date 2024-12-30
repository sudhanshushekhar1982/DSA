package stack;

// A Stack is a linear data structure that follows 
// a particular order in which the operations are performed. 
// The order may be LIFO(Last In First Out) or FILO(First In Last Out)

/* Three operations in stack:
   push O(1)
   pop  O(1)
   peek O(1) */

import java.util.ArrayList;

public class stack_f1 {

    static class MyStack { // Renamed to avoid confusion
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if the stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push operation
        public static void push(int data) {
            list.add(data);
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return a sentinel value
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return a sentinel value
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(); // Create an instance of MyStack

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top element: " + s.peek()); // Output: 3

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        /* System.out.println("Popped: " + s.pop()); // Output: 3
        System.out.println("Popped: " + s.pop()); // Output: 2
        System.out.println("Popped: " + s.pop()); // Output: 1

        System.out.println("Is stack empty? " + s.isEmpty()); // Output: true
        */
    }
}
