package ArrayList24;
import java.awt.*;
import java.util.*; // in side the * all operator classes are imported
import java.util.ArrayList; // it's for reservered for ArrayList

public class Intro {
    public static void main(String[] args) {
//        ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

//        Operations

        // Add element        0(0)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);

       // Get element        0(1)
          // get method
        Integer n= list.get(1);
        System.out.println("at index 1 number is:"+n);



       // Remove Element     0(n)
            // Removing element from above ArrayList
        list.remove(5);

        // Printing the updated Arraylist elements
        System.out.println("After the Index Removal " + list);

        // Removing this word element in ArrayList
        list.remove(1);

        // Now printing updated ArrayList
        System.out.println("After the Object Removal "
                + list);
        // Set element at index  0(n)
        list.set(1, 9);

        //  Printing the updated Arraylist
        System.out.println("Updated ArrayList " + list);


        // Container Element  0(n)



    }
}
