package shorting;

import java.util.Arrays;
import java.util.Collection;

public class InbultSort {

    // Method to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline for cleaner output
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 }; // Unsorted array

        // Sorting the array in ascending order using Arrays.sort()
        Arrays.sort(arr); // this without indexing shorting all arrys.
        Arrays.sort(arr, 0, 5); // according with this mathods we can short by indexing

        // Printing the sorted array
        printArr(arr);
    }
}
