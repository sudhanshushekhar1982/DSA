import java.util.*;
import java.util.Stack;
public class stack_new {
    public static void pushAtBottom(Stack<Integer>s,int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx=0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static String revString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer>s) {
        if(s.isEmpty()) {
            return;
        }
        
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] main) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 6);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }
        // String str = "himanshushekhar";
        // String result = revString(str);
        // System.out.println(result);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        //printStack(s);
        reverseStack(s);
        printStack(s);
    }
}