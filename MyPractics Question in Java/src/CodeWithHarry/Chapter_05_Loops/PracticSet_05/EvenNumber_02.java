package CodeWithHarry.Chapter_05_Loops.PracticSet_05;

public class EvenNumber_02 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4; // 0+2+4+6=12
        for(int i=0; i<n; i++){
            sum = sum + (2*i);

        }
        System.out.print("the sum of even number: " + sum);
    }
}
