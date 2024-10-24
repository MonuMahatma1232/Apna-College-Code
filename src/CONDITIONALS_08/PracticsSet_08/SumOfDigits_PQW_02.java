package CONDITIONALS_08.PracticsSet_08;
import java.util.Scanner;
public class SumOfDigits_PQW_02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int SumOfDigits = 0;
        int original_n = n;

        while (n > 0) {
            SumOfDigits += n % 10;
            n = n / 10;

        }
        System.out.println("Sum of digits in " + original_n + " = " + SumOfDigits);

    }
}
