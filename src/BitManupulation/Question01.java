package BitManupulation;
// check if a Number is a Power of 2 or not

public class Question01 {
    public  static boolean isPowerOftwo(int n ){
        return (n&(n-1)) == 0;

    }
     public static void main(String args[]){
         System.out.println(isPowerOftwo(15));
     }

}
