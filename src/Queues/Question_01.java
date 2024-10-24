package Queues;
import java.util.Queue;
public class Question_01 {
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


          static class Queue{
        static Node head = null;
        static Node teil = null;

                public  static  boolean isEmpty(){

                    return head == null && teil == null;
                }

                // add
                public static  void add (int data){
                    Node newNode = new Node(data);
                    if(head == null){
                        head= teil =newNode;
                        return;
                    }
                    teil.next = newNode;
                    teil = newNode;
                }
                // remove
                public static int remove() {
                    if (isEmpty()) {
                        System.out.println("empty queues");
                        return -1;
                    }
                    int front = head.data;
                    //singale element
                    if (teil == head) {
                        teil = head = null;

                    } else {
                        head = head.next;
                    }
                    return front;
                }

                // peeks
                public static  int peek(){
                    if(isEmpty()){
                        System.out.println("empty queue");
                        return -1;
                    }
                    return head.data;
                }
            }
            public static void main(String[] args) {
        Queue q = new Queue();
                q.add(1);
                q.add(2);
                q.add(3);

                // 1 2 3
                while (!q.isEmpty()){
                    System.out.println(q.peek());
                    q.remove();
                }
            }
}


