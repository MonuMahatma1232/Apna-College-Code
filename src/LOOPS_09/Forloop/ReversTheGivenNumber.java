package LOOPS_09.Forloop;

public class ReversTheGivenNumber {
    public static void main(String[] args) {
        // revers = (revers*10) + lastDigit
        int n = 10899;
        int rev = 0;
        while (n>0){
            int lastDig = n %10;
            rev = rev*lastDig;
            n = n/10;

        }
        System.out.println(rev);
    }
}
