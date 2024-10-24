package OOPS;



public class Constuctor {
    public static  void main(String args[]){
        Student s1 = new Student();
        System.out.println(s1.name);

    }

}
class Student{
    String name;
    int roll;


// non para
    Student(){
        //this.name = name;
        System.out.println("Constructor is colled...");
    }
}