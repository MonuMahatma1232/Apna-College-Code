package LOOPS_09.WhileLoop;


import java.util.Scanner;

public class Ps_04 {
    public static void main(String[] args) {
        // output from the user to print the sum of the number using while loop
        // the sum of number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while (i<= n){
            sum += i;
            i++;
        }
        System.out.println("Sum is: "+sum);
    }
}
