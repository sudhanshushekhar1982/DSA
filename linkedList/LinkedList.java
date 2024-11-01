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

    /* Adding in the linked list
     * 1)create new node
     * 2)new node's next = head
     * 3)head = new Node
     */

     public void addFirst(int data) { // overall time complexity of the funnction O(1)
        
        // step-1) create new node
        Node newNode = new Node(data);

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
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        System.out.println(ll.head.data+"->"+ll.head.next.data+"->"+ll.head.next.next.data);
    }
 } 