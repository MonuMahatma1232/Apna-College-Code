package ChallengesOf100Question;
import java.util.*;

//How to get Using input using Scanner Program in java.

public class GateInputFromUser04{
    public static void main(String args[]){
        int a;
        float b;
        String s;

        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a String");
        s = in.nextLine();
        System.out.println("you entered string:-  " + s);

        System.out.println("Enter an Float");
        b =  in.nextInt();
        System.out.println("you Enter the Float :- " + b );

        System.out.println("Enter the integer");
        a = in.nextInt();
        System.out.println(" you inter the integer:- " + a);

    }

}
