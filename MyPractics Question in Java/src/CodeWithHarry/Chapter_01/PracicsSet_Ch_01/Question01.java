package CodeWithHarry.Chapter_01.PracicsSet_Ch_01;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        int c = 9;
        int sum = a+b+c;
        System.out.println(sum);


        // Question02

        float subject1 = 57;
        float subject2 = 99;
        float subject3 = 93;
        float CGPA = (subject1+subject2+subject3)/30;
        System.out.println("the CPA of the Subject: "+CGPA);


//        Quwstion03

        System.out.println("What is your name: ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("Hello "  + Name + " Have a good day!");

//        Question05
        System.out.println("Enter Your Number");
        Scanner Sc = new Scanner(System.in);
        System.out.println(Sc.hasNextBigInteger());

    }
}
