package JavaBasicPreacticSet;
class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    final public void show() {
        System.out.println("Derived::show() called");
    }
}
public class PS_02 {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }


}
