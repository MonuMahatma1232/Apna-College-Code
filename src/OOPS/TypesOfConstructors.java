package OOPS;

public class TypesOfConstructors {
    public static void main(String args[]){
        client s1 = new client();
        client s2 = new client("Abhimanyu");
        client s3 = new client(123);


  }

}
class client{
    String name;
    int roll;
    client(){
        //this.name = name;
        System.out.println("Constructor is colled...");
    }
    client(String name){
        this.name = name;


    }
    client(int roll){
        this.roll = roll;
    }
}

