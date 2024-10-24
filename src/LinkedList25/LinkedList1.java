package LinkedList25;

import javax.xml.crypto.Data;
import java.util.LinkedList;

public class LinkedList1 {
    class Node{
        int Data;
        Node Next;

        public Node(int Data){
            this.Data = Data;
            this.Next = null;
        }

    }
    public  static Node head;
    public  static Node tail;

    //Methodes
    // add First
    public  void addFirst(int Data){

        //step1 = create new node
        Node newNode = new Node(Data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
         newNode.Next = head; // links

        //step3 - head = newNode
        head = newNode;

    }
    //add Last
    public  void  addLast(int Data){
        Node  newNode = new Node(Data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;
        tail = newNode;

    }

    public void Print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;

        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.Data+" ");
            temp = temp.Next;
        }
        System.out.println(" ");
    }

    public void  reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node Next;

        while (curr != null){
            Next = curr.Next;
            curr.Next  = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }

    /* public  static boolean isCycle() {
         Node slow = head;
         Node fast = head;

         while (fast != null && fast.Next != null) {
             slow = slow.Next; //+1
             fast = fast.Next.Next; //+2
             if (slow == fast) {
                 return true; // cycle exists
             }
         }
         return false; //Cycle doesn't exist*/

         /*public static void removeCycle () {
             // detect cycle
             Node Slow = head;
             Node Fast = head;
             boolean cycle = false;
             while (fast != null && fast.Next != null) {
                 slow = slow.Next;
                 fast = fast.Next.Next;
                 if (fast == slow) {
                     cycle = true;
                     break;
                 }
             }

             if (cycle == false) {
                 //return;
             }
             // find meeting pint
             slow = head;
             Node prev = null; // last node
             while (slow != fast) {
                 prev = fast;
                 slow = slow.Next;
                 fast = fast.Next;
             }
             // remove cycle -> last.next = null
             prev.Next = null;

         }*/

         public static void main (String[]args){
             //  LinkedList ll = new LinkedList();
        /*ll.peek();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll. addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();*/

         /*    head = new Node(1);
             head.Next = new Node(2);
             head.Next.Next = new Node(3);
             head.Next.Next.Next = head;
             //1->2->3->1
             System.out.println(isCycle(isCycle()));*/

         }

     }
