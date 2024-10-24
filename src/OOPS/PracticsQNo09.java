package OOPS;

public class PracticsQNo09 {
    static int marks;
    void set_marks(int marks) {
        this.marks = marks;
    }
}
class OOPS{
    public static void main(String[] args){
        PracticsQNo09 t = new PracticsQNo09();
        t.set_marks(98);
        System.out.println(PracticsQNo09.marks);
    }
}


