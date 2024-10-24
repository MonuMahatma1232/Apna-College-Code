package TranigClass;

class College {
    public void Method() {
        System.out.println("x");
    }
}

class Staff extends College {
    public void Method() {
        System.out.println("y");
    }
}

class Student extends College {
    public void Method() {
        System.out.println("z");
    }
}

class Nontech extends College {
    public void Method() {
        System.out.println("z");
    }
}

   public class CSE {
    public static void main(String[] args) {
        College c = new College();
        College st = new Staff();
        College stu = new Student();
        College non = new Nontech();

        c.Method();
        st.Method();
        stu.Method();
        non.Method();







    }
}



