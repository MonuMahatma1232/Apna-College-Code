package CodeWithHarry.Chapter_06_Arrays.PracticeSet_06;

public class Cha_06_QN_03 {
    public static void main(String[] args) {
        // Practice Problem 3

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);

    }
}
