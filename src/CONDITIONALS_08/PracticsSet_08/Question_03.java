package CONDITIONALS_08.PracticsSet_08;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number(1-7): ");
        int Week = sc.nextInt();

        switch (Week){
            case 1 :
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println(" Thursday");

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Invalid input! please enter week number between 1-7.");

        }
    }
}
