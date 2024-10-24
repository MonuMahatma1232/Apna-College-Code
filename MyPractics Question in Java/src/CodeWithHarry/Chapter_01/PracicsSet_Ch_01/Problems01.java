package CodeWithHarry.Chapter_01.PracicsSet_Ch_01;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Problems01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics: ");
        int P = sc.nextInt();
        System.out.println("Enter the marks of Chemistry: ");
        int C = sc.nextInt();
        System.out.println("Enter the marks of Math: ");
        int M = sc.nextInt();
        System.out.println("Enter the marks of Hindi: ");
        int H = sc.nextInt();
        System.out.println("Enter the marks of English: ");
        int E = sc.nextInt();
        float Percentage = ((P+C+M+H+E)/500.f)*100;
        System.out.println("percentage : ");
        System.out.println(Percentage);

    }
}
