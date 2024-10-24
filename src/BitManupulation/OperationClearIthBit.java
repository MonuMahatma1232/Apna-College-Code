package BitManupulation;

public class OperationClearIthBit {
    public static int clearIthBit(int n , int i ){
        int bitMask = ~(i<<i);
        return n | bitMask;

    }
    public static void main(String Args[]){
        System.out.println(clearIthBit(10,1));
    }
    // Update Ith Bit

}

