package CONDITIONALS_08.PracticsSet_08;
import java.util.Scanner;
public class CountDigit_PWD_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;

        while (n>0){
            n = n/10;
            numOfDigits++; // numOfDigits = numOfDigits +1;

        }
        System.out.println("Number of  Digits in " + original_n + " = " + numOfDigits);
    }
}
