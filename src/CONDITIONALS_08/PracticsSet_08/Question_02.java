package CONDITIONALS_08.PracticsSet_08;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int temp = sc.nextInt();
//
//         if (100<=temp){
//             System.out.println("You have a fever");
//         }
//         else {
//            System.out.println("you don't have fever");
//
//        }

        double temp = 103.5;

        if(temp>100){
            System.out.println("you have fever ");
        }
        else {
            System.out.println("you don't have fever");
        }
    }
}
