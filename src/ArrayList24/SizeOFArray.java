package ArrayList24;
import java.util.ArrayList;
import java.util.*;
public class SizeOFArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());

        // print the arraylist
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");

        }
        System.out.println();

    }
}
