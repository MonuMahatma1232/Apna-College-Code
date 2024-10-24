package LOOPS_09;

import java.util.Scanner;

public class PracticSet_09 {

//        Question_01

//        for(int i = 0; i<5; i++){
//            System.out.println("hello");
//            i+=2;
//            // Answer --> 2 times(hello,hello)
//
//
//        }
//        Question_02

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of values: ");
//        int n = sc.nextInt();
//        int oddSum = 0, evenSum = 0;
//
//
//        System.out.println("Enter your values:");
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            if (x % 2 == 0)
//                evenSum += x;
//            else
//                oddSum += x;
//        }
//
//        System.out.println("Sum of Even Numbers: " + evenSum);
//        System.out.println("Sum of Odd Numbers: " + oddSum);

//        Question_03

//        Scanner sc  = new Scanner(System.in);
//        int num;
//        int fact = 1;
//        System.out.println("Enter any Positive integer: ");
//
//         num = sc.nextInt();
//
//         for (int i=1; i<=num; i++){
//             fact +=i;
//         }
//        System.out.println("Factorial : " + fact);

//        Question_04
    public static void PrimeMultiplication(int number){



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }

    }
    public static void main(String[] args) {
        PrimeMultiplication(8);
    }
}
