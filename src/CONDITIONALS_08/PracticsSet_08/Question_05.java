package CONDITIONALS_08.PracticsSet_08;

import java.time.Year;
import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        // input to user
        // leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0 ) && (year % 400 == 0));

        if (x && (y || x)){
            System.out.println(year + " is a leap year ");

        }
        else {
            System.out.println(year + " is a not leap yeas");
        }

    }
}
