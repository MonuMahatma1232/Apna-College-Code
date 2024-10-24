package LOOPS_09.Forloop;

public class PrintTheReversNumber {
    public static void main(String[] args) {
        // n = 10899
        // last Digit    (n)umb%10) -->% modulo
        // remove last dig  (num/10)
        int n = 10899;
        while (n > 0){
            int lastdig = n % 10;
            System.out.print( lastdig + "");
            n = n/10;

        }
        System.out.println();
    }
}
