package FUNCTION;

public class Ch_04_product {
    public static  int Multiple(int a, int b){
        int Products = a * b;
        return Products;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

       int prod = Multiple(a,b);
        System.out.println("a * b = "  + prod);

    }

}
