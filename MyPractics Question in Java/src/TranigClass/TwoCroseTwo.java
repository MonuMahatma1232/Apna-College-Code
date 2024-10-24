package TranigClass;

public class TwoCroseTwo {

    // Question01

        public static void main(String[] args) {
            int[][] myarray = new int[2][2];
            myarray[0][0] = 1;
            myarray[0][1] =  myarray[1][0] =  0;
            myarray[1][1] = 1;
            System.out.println("Array elements are:");
            System.out.println(myarray[0][0] + " " +myarray[0][1]);
            System.out.println(myarray[1][0] + " " +myarray[1][1]);
            System.out.println();

//            Question3

            //2-d array initialised with values
            int[][] intArray = { { 1, 2 }, { 3, 4 },{5,6}};
            //print the array
            System.out.println("Initialized Two dimensional array:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(intArray [i][j] + " ");
                }

                System.out.println();
            }

            //






        }
    }

