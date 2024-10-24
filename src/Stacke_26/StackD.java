package Stacke_26;
import java.util.*;

public class StackD {

    public static void main(String[] args) {
        //StackB.Stack s = new StackB.Stack();
        Stack<Integer> s =new Stack<>(); // Good of the Stack Mathade
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s. isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
