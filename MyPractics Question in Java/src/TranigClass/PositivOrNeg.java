package TranigClass;

import java.util.Scanner;
public class PositivOrNeg {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number=");
        number = sc.nextInt();
        if (number > 0) {
            System.out.println("it is an Positive Number.");
        } else if (number < 0) {
            System.out.println("It is an Negative Number.");

        }

    }
}
