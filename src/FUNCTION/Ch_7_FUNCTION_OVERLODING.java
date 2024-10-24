package FUNCTION;

public class Ch_7_FUNCTION_OVERLODING {
//    function to calculate 2 sum
    public static int sum(int a, int b){
        return  a+b;

    }
//    function to calculate 2 sum
    public static int sum(int a, int b, int c){
        return a+b+c;

    }
//    Function to Calculate the 4 Number
    public static int sum(int w, int x, int y, int z ){
        return w+x+y+z;

    }

    public static void main(String[] args) {
        System.out.println(sum(3, 3));
        System.out.println(sum(8,6,2));
        System.out.println(sum(8,9,7,4));
    }

}
