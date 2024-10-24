package shorting;

public class Shortng_02 {
    public static void SelectionShort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int mainPos = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[mainPos] > arr[j]){
                        mainPos = j;
                }
            }
            //swap
            int temp =arr[mainPos];
            arr[mainPos] = arr[i];
            arr[i] = temp;
        }


    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {6, 1, 3, 5,7, 9};
        SelectionShort(arr);
        printArr(arr);
    }

}
