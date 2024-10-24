package CodeWithHarry.CHa_08_OOPS.PacticsSet_08;

    class Employee{
        int salary;
        String name;

        public int getSalary(){

            return salary;
        }
        public String getName(){

            return name;
        }
        public void setName(String n){

            name = n;
        }
    }

    class CellPhone{
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callFriend(){
            System.out.println("Calling Mukul...");
        }

    }

    class Square{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    class rectangle{
        double length ;
        double high;
        public double area(){
            return length*high;
        }
     /*   public double perimeter1{
            perimeter1 =  2*(length+high);
        }*/


    }

    class Tommy{
        public void hit(){
            System.out.println("Hitting the enemy");
        }
        public void run(){
            System.out.println("Running from the enemy");
        }
        public void fire(){
            System.out.println("Firing on the enemy");
        }
    }
public class CHa_08_PS_01 {
        public static void main(String[] args) {
        /*
        // Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        //asus.ring();


        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         */
            //problems 04
            rectangle ar = new rectangle();
            ar.length = 8;
            ar.high = 7;
            System.out.println(ar.area());
           // System.out.println(ar.pera);



            // Problem 5
            Tommy player1 = new Tommy();
            player1.fire();
            player1.run();
            player1.hit();


        }

}
