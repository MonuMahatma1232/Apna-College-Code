package ChallengesOf100Question;

import java.util.Scanner;

public class SwapNumbr06 {
    public static void main(String agrs[]){
        int x, y,temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping\nx = "+x+"\ny = " + y );

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swappping\nx = "+x+"\ny = "+y);
    }

}
