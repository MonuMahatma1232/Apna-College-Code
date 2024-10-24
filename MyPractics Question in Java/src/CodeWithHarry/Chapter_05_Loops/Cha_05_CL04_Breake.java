package CodeWithHarry.Chapter_05_Loops;

public class Cha_05_CL04_Breake {
    public static void main(String[] args) {
       /* for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("java is Great!");
            if (i == 2) {
                System.out.println("stop the loop!");
                break;
            }
        }*/
// while loop
        /*int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("java is Great!");
            if (i == 2) {
                System.out.println("stop the loop!");
                break;

            }
            i++;
        }
        System.out.println("loop ends here");*/

        // do_while loop
      /*  int i = 0;
       do {
            System.out.println(i);
            System.out.println("java is Great!");
            if (i == 2) {
                System.out.println("stop the loop!");
                break;

            }
            i++;
        } while (i < 5);
        System.out.println("loop ends here");*/

        // for continue(For,for for_loop);
      /*  for (int i=0; i < 50; i++) {
            if (i == 2) {
                System.out.println("stop the loop!");
                continue;
            }
            System.out.println(i);
            System.out.println("java is Great!");
        }*/

        // for continue(For,for for_loop);
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("stop the loop!");
                continue;

            }
            System.out.println(i);
            System.out.println("java is Great!");

        } while (i < 5);
        System.out.println("loop ends here");


    }
}
