package FUNCTION;

import java.util.Scanner;

public class Ch_02_Parameters {
    // returnType Name (type parame1, type pram2){
    // boody
    // return statement;
 //}


    public static void CalculateSum(int num1, int num2){ // parameter and formal parameter
        int sum = num1 + num2;
        //return sum;
        System.out.println("sum is : " + sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextByte();
       // int sum = CalculateSum(a, b); // argument or parameter
//        int sum = a+b;


        CalculateSum(a,b);
//        Calculat



    }


}
