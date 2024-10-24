package LinkedList25.Part2;
import org.w3c.dom.Node;

import java.util.LinkedList; // JCF -> optimized

public class LLIncollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }

}
