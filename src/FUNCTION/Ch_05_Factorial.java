package FUNCTION;

public class Ch_05_Factorial {
    public static int Factorials (int n){
        int f = 1;

        for (int i=1; i<=n; i++){
            f = f * i;
        }
        return f; // factorial of n
    }

    public static void main(String[] args) {
        System.out.println(Factorials(5));
    }


}
