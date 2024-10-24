package CONDITIONALS_08.PracticsSet_08;
import java.util.Scanner;


public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inter your age: ");
        int age = sc.nextInt();


        if(age<=12){
            System.out.println("You are Chile");
        }
       else if(age >12 && age<18){
            System.out.println("You are Teenager");
        }
        else{
            System.out.println("You are adult");
        }

    }
}
