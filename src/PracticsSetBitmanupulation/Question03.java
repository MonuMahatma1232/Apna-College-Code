package PracticsSetBitmanupulation;

import java.util.SortedMap;

//Question 3 :Add 1 to an integer using Bit Manipulation.
// (Hint: try using Bitwise NOT Operator
public class Question03 {
   // The expression-~x will add 1 to an integer x.We know that to get negative of an umber ,invert its bits and add 1 to it
    // (Remember negative numbers are stored in 2’s complement form), i.e.

    public static void main(String args[]){
        int x = 6;
        System.out.println(x + " + " + 1 + " is " +  - ~x);
        x = - 4;
        System.out.println(x + " + " + 1 + " is " +  - ~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " +  - ~x);

    }

}
