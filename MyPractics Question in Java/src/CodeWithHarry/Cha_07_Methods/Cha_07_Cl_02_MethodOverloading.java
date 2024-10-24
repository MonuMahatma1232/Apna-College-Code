package CodeWithHarry.Cha_07_Methods;

public class Cha_07_Cl_02_MethodOverloading {
   /* static void telljocke(){
        System.out.println("i invented a new word!\n "
                + "plagiarism!");*/
    static void change(int a){
        a = 23;


    }

    public static void main(String[] args) {
       // telljocke();
         int [] marks = {23,23,33,25,35, 57,57};
         int x = 76;
         change(x);
        System.out.println("The value of x after return change is: " + x);
            }

}
