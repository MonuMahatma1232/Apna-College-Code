package ChallengesOf100Question;

import java.util.Scanner;

public class FarenheitToCelsious05 {
    public static void main (String ages[]){
        float temperatur;
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperatur = in.nextInt();

        temperatur = ((temperatur - 32) *5 )/ 9;
        System.out.println("Temperature in Celsius = " + temperatur);

    }
}

