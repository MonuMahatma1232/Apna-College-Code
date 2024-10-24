package TranigClass.Constracter;

public class Studentdata{
    String cse;
    String ece;
    String eee;

    public Studentdata(){
        cse = "001";
        ece = "002";
        eee = "003";
    }
    public static void main(String[] args){
        Studentdata a = new Studentdata();
        System.out.println("CSE"+a.cse);
        System.out.println("ECE"+a.ece);
        System.out.println("EEE"+a.eee);
    }
}

