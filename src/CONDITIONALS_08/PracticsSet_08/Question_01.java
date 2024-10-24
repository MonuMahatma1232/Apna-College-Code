package CONDITIONALS_08.PracticsSet_08;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative;

        int a = sc.nextInt();
        if (a>0){
            System.out.println("a is the Grater than 0");

        }
        else {
            System.out.println("a is the less the 0");
        }

    }
}
