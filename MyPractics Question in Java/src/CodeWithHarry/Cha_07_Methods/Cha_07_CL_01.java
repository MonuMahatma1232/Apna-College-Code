package CodeWithHarry.Cha_07_Methods;

public class Cha_07_CL_01 {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
        // method invocation using object creation
         //Cha_07_CL_01 obj = new Cha_07_CL_01();
        //c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println(c);

        //second
        int a1 = 7;
        int b1 = 8;
        int c1;
        c = logic(a1,b1);
        System.out.println(c);


    }

}
