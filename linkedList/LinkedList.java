/* Linked list contains two part one is the 
 * node part and other is the link part. The  node contains 
 * two components one is the data and other is the next or reference or the 
 * pointer  for the next node.
 * 
 * ek linked list banane ke lie pehle ek class
 * banana padta hai uske baad us class ke undar 
 * data or next ko define krnna hota hai.Uske baad 
 * ek constructor lgta hai.
 * 
 * ek linked list ke andar do nodes always important hota hai
 * ek humra head node aur dusra hota hai humara tail node.
 * agar hume linkedList ke andar traverse karna hia tonphir hume in 
 * dono nodes ka help lagta hai always.
 */

import java.security.PublicKey;

import recursion.tilingProblem;

public class LinkedList {
    public static class Node {///sabse pehle ek class hoga
        int data;
        Node next;      //phir data aur next defined hoga

        public Node(int data) {
            this.data=data;
            this.next=null; //phir constructor hoga
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    /* Adding in the linked list
     * 1)create new node
     * 2)new node's next = head
     * 3)head = new Node
     */

     public static void addFirst(int data) { // overall time complexity of the funnction O(1)

        // step-1) create new node
        Node newNode = new Node(data);
        size++;

        //assuming if my linked list is empty
        if(head  == null ) {
            head = tail = newNode;
            return;
        }

        //step -2) assigninng the new nodes next value to the head
        newNode.next = head;//linking step

        //step -3) head = newNode
        head = newNode;
     }
 
     //Add at last function
     /*1)create a new node
       2)tail.next = new Node
       3) tail = newNode
       4)
      */
      public void addLast(int data) { // constant time operation O(1)
        Node newNode = new Node(data);
        size++;
        if(head  == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
      }

      //printing the linkedList
      public static void printLL(Node head) {   //this method is having linear time complexity O(1)
        if(head == null) {
            System.out.println("Linked List is empty!");
            return;
        }
        Node temp = head;
        
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
            if(temp == null) {
                System.out.print("null");
            }
        } 
        System.out.println();
       
      }
      public static void addMiddle(int pos,int data) { // linear time complexity
        if(pos == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0;
        while (i != pos-1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
      }

      /*public static void addAtMiddle(int pos,int data) {
        Node temp = head;
        int i =0;
        while(i != pos-1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
      } */



      //SIZE KO PRINT YA NKALNE KA DO TARIKA HAI

      //step 1)har node ke banne pr ya delete krne pr size ko update kar le isse isse constant time me size aa jaega O(1)
      //step 2)by loop method bhi nikal skte hai linear hoga complexity O(n)
     public static void size(Node head) { 
        int calc= 1;
        if( head  == null) {
            System.out.println("the linked list is empty!");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            calc++;
            temp = temp.next;
        }
        System.out.println("the size of the linked List is:"+calc);
     }

     public static int removeFirst() { //constant time comlexity ke andar hota hai: O(1)
        if(size == 0) {
            System.out.println("UnderFlow Error!");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val =head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
     }

     public static int removeLast() {
        if( size == 0 ) {
            System.out.println("UnderFlow Error!");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } 
        Node prev = head;
        for(int i =0;i<size-2;i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
     }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLL(head);
        ll.addFirst(2);
        ll.printLL(head);
        ll.addFirst(1);
        ll.printLL(head);
        ll.addLast(3);
        ll.printLL(head);
        //System.out.println(ll.head.data+"->"+ll.head.next.data+"->"+ll.head.next.next.data);
        printLL(head);
        ll.addMiddle(3, 4);
        ll.printLL(head);
        System.out.println(ll.size);
        System.out.println("The removed value is:"+ll.removeFirst());
        ll.printLL(head);
        System.out.println("The last deleted value is:"+ll.removeLast());
        ll.printLL(head);
    }
 } 