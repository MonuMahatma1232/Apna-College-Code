package CodeWithHarry.Cha_12_Multthrading.practice;
import java.util.ArrayList;

class Thread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
public  class Cha12_PS_01  {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
