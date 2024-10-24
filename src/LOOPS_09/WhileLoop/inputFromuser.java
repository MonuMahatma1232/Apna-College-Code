package LOOPS_09.WhileLoop;

import java.util.Scanner;

public class inputFromuser {
    public static void main(String[] args) {
        // input from user
        //print number from 1 to n
        Scanner sc = new Scanner(System.in);
        int ramge = sc.nextInt();

        int n = 1;

        while (n<=ramge){
            System.out.println(n + " ");
            n++;
        }
        System.out.println();
    }

}
