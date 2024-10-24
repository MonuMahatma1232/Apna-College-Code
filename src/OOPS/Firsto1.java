package OOPS;

public class Firsto1 {
    public static void main(String args[]){
        pen p1 = new pen();// created a pen object called p1;
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTio(5);
        System.out.println(p1.tip);
        //p1. setColor("yello")
        p1.color = "yello";
        System.out.println(p1.color);

        BankAccunt myAcc = new BankAccunt();
        myAcc.Username = "abhimanyu";
        myAcc.setPassword("jshfdjfkadj");

    }

}

class  pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTio (int newTip){
        tip = newTip;
    }
}
class BankAccunt{
    public String Username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

//class Student{
//    String name;
//
//    int percentage;
//    float percentage(int phy, int chem, int math){
//        percentage = ( phy+chem+math) /3;
//
//    }
//}