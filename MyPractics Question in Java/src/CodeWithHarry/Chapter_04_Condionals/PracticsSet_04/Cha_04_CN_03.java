package CodeWithHarry.Chapter_04_Condionals.PracticsSet_04;

import java.util.Scanner;

public class Cha_04_CN_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your income in Lakhs per annum");
        float tex = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tex = tex + 0;
        }
        else if(income>2.5f && income<= 5f){
            tex = tex + 0.05f* (income - 2.5f);
        }

        else if (income>5f && income <= 10.0f){
            tex = tex + 0.05f * (5.0f - 2.5f);
            tex = tex + 0.2f * (income - 5f);

        }else if (income>10.0f) {
            tex = tex + 0.05f * (5.0f - 2.5f);
            tex = tex + 0.2f * (10.0f - 5f);
            tex = tex + 0.3f * (income - 10.0f);

        }
        System.out.println("The total tex paid by the employee is:" + tex);

    }
}
