package FUNCTION;

public class Ch_08_primeOrNot {

//    public static boolean isPrime(int n ){
//        // corner cass
//        boolean isprime = true;
//        for(int i=2; i<=n-1; i++){
//            if (n% i == 0){ // completely dividing
//                isprime = false;
//                break;
//            }
//        }
//        return isprime;
//
//    }
    public static boolean isPrime(int n ){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));

    }

}
