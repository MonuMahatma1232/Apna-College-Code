package STRING;


public class Comparing_String {
    public static void main(String agrs[]) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[1];
        for (int i = 1; i < fruits.length; i++){
           if(largest.compareTo(fruits[i])< 1){
               largest = fruits[i];


            }
        }
        System.out.println(largest);
    }
}
