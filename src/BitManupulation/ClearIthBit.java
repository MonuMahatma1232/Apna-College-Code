package BitManupulation;

public class ClearIthBit {
    public static int clearBitsInRange(int  n , int i , int j){
        int a  = ((~0) <<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String Args[]){
        System.out.println(clearBitsInRange(10,3, 4));
    }
}
