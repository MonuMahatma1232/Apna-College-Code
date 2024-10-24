package shorting;

import java.util.Arrays;
import java.util.Collections;

public class ReversOrderSorting {

    // Method to print the array
    public static void printArr(Integer arr[]) {
        for (Integer i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline for cleaner output
    }

    // this the revers shorting logic
    // public static int compare(int a, int b){
    // a < b = -ve
    // a == b = 0
    // a > b = +ve
    // retun b-a;
    // }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 }; // Unsorted array

        // Sorting the array in ascending order using Arrays.sort()
        Arrays.sort(arr, Collections.reverseOrder()); // this without indexing shorting all arrys.
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // according with this mathods we can short by indexing

        // Printing the sorted array
        printArr(arr);
    }
}
