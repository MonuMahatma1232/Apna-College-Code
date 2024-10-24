package CodeWithHarry.Chapter_04_Condionals.PracticsSet_04;

import java.util.Scanner;

public class Cha_04_CN_02 {
    public static void main(String[] args) {
        byte m1, m2, m3;

        Scanner sc = new Scanner(System.in);

        System.out.println("The marks of Subject1: ");
        m1 = sc.nextByte();

        System.out.println("The marks of Subject2: ");
        m2 = sc.nextByte();

        System.out.println("The marks of Subject3: ");
       m3 = sc.nextByte();
       float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is: " + avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation, you have been promoted");
        }else
            System.out.println("Sorry,you have not promoted! Please try again");
    }
}
