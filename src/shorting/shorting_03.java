package shorting;

public class shorting_03 {
    // pic an element(form unshorted  part) & pllace in the right pos in the shorted part
    public static void insertion(int arr[]) {

        for(int i=1; i<arr.length; i++){
            int curr =  i;
            int prev = i-1;
            // finding out the correct position pot to insert
            while (prev >=0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = arr[curr];

        }

    }
}