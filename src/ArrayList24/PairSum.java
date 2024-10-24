package ArrayList24;
import java.util.ArrayList;
import java.util.*;


 class PairSum{
     // Fills element in arr[] from its pair sum array pair[].
     // n is size of arr[]
    public boolean pairsum2(ArrayList<Integer> list, int targer) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }

        }
        int lp = bp + 1; // smallest
        int rp = bp; // largest

        while (lp != rp) {
            //cass1
            if (list.get(lp) + list.get(rp) == targer) {
                return true;

            }
//            cass 2
            if (list.get(lp) + list.get(rp) < targer) {
                lp = (lp + 1) % n;

            } else {
                //cass3
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10 - sorted & Rotated array
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            int target = 16;
        System.out.println();
        }

 }


