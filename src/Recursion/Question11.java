package Recursion;
import java.io.*;
public class Question11 {
    static int getNoOfWays(int n)
    {

        // Base case
        if (n <= 2) {
            return n;
        }
        return getNoOfWays(n - 1) + getNoOfWays(n - 2);
    }

    // Driver Function
    public static void main(String[] args)
    {
        System.out.println(getNoOfWays(4));
        System.out.println(getNoOfWays(3));
    }
}