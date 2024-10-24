package Stacke_26;
import java.util.*;
public class Question_02 {
    // Reverse a String using a Stack.
    public  static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
       return result.toString();

    }
        public static void main(String[] args) {
        String str = "MahatmaMonu";
        String result = reverseString(str);
            System.out.println(result);

    }
}