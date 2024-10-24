package TranigClass.Constracter;

 abstract class College{
    abstract void College();
}
class Staff extends College {
    void College(){
        System.out.println("Welcome Staff!");
    }
}
class Student extends College {
    void College(){
        System.out.println("Welcome student!");
    }
}
class Nontech extends College {
    void College(){
        System.out.println("Welcome Nontech!");
    }
}
class main{
    public static void main(String[] args) {
        College s = new Staff();
        s.College();

    }
}
