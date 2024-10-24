package CodeWithHarry.Cha_09_AcceModifire;

class  MyEmployee{
     private int id;
     private String name;


      public  String getName(){
          return name;
      }
      public void setName(String n ){
          name = n;

      }
      public void setId(int i){
          id = i;
      }
      public int getId(){
          return id;
      }

}

public class Chs_09_Cl_01 {
    public static void main(String[] args) {
        MyEmployee Abhi = new MyEmployee();
        // Abhi.id = 45;
        //Abhi.name = "AbhimanyuPaswan"; --> Throws an error due to private access modifier
        Abhi.setName("AbhimanyuPaswan");
        System.out.println(Abhi.getName());
        Abhi.setId(620);
        System.out.println(Abhi.getId());

    }
}
