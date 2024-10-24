package FUNCTION;

public class Ch_03_Swap {
    public static void swap(int a, int b){
        // Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // swap - values exchange
    public static void main(String[] args) {


        int a = 5;
        int b = 10;

//        System.out.println("a = " + a);
//        System.out.println("b = " + b); // it means coll by pass (int not swap the value)
    }

}
