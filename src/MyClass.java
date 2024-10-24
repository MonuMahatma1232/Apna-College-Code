public class MyClass {
    private int number;

    public MyClass(int a) {
        number = a;
    }

    public void method1() {
        System.out.println(this.number);
        // Call method2 using this
        this.method2();
    }

    public void method2() {
        System.out.println("Inside method2");
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        obj.method1();
    }
}

