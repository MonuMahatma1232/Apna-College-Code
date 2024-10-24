package Queues;
import java.util.*;
public class QuestionUsingCFG {
    public static void main(String[] args) {
//        Question_01.Queue q = new Question_01.Queue();
        //Queue<Integer> q = new LinkedList<>(); //ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();
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
