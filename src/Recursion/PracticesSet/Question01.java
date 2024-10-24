package Recursion.PracticesSet;
// for a given integer arry of size N. you have to find all the occurence (indices) of a given elemet(key) and print. use a recursion function to solve this problem.
public class Question01 {
    public  int[]  AllIndexRecursive(int input[], int x, int start) {
        if (start == input.length) {
            int[] ans = new int[0];
            return ans;
        }
        int[] Smallindex = AllIndexRecursive(input, x, start + 1);
        if (input[start] == x) {
            int[] myAns = new int[Smallindex.length + 1];
            myAns[0] = start;
            for (int i = 0; i < Smallindex.length; i++) {
                myAns[i + 1] = Smallindex[i];

            }
            return myAns;
        } else {
            return Smallindex;
        }
    }

    public int[] AllIndexes(int input[], int x){
        return AllIndexRecursive(input, x, 0);

    }

    public static void main(String[] args) {
        Question01 d = new Question01();
        int arr[] = {3,2,4,5,6,2,7,2,2}, x=2;
        int output[] = d.AllIndexes(arr,x);
        for(int i = 0;  i<output.length; i++){
            System.out.println(output[i]+ " ");
        }
    }

}
