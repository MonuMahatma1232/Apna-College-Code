package CodeWithHarry.Cha_09_AcceModifire;

class myMainEmployee {
    private int id;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setId(int i) {
        this.id = i;

    }

    public int getId() {
        return id;
    }

    public class Cha_09_CL_03_enpmloyee{
        public static void main(String[] args) {
            myMainEmployee abhi = new myMainEmployee();
            abhi.setName("abhimanyumahatma");


        }
    }
}
