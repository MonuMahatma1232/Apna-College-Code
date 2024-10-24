package Recursion;

public class Probms13 {
    // fraindPairing  problmes
    public static int fraindPairing(int n ){
        if(n== 1 || n== 2){
            return n;
        }
        //choice singal;
        int fnm1 = fraindPairing(n-1);

        //pair
        int fnm2 = fraindPairing(n - 2);
        int pairWays = (n-1) * fnm2;

        int totWays = fnm1+pairWays;
        return totWays;
        //return fraindPairing(n-1) + (n-1 ) * fraindPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fraindPairing(3));

    }
}
