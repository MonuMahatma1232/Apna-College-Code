package CodeWithHarry.Chapter_04_Condionals.PracticsSet_04;

import java.util.Scanner;

public class Cha_04_CN_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("this is an organization website");
        } else if (website.endsWith(".com")) {
            System.out.println("this is an commercial website");

        } else if (website.endsWith(".in")) {
            System.out.println("this is an indian website");
        }
    }

}
