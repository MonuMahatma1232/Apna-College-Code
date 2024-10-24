package CodeWithHarry.Cha_09_AcceModifire.PracticsSet_09;
/*
Chapter 9- Practice Set.

Create a class Cylinder and use getters and Setters to bet its radius and height.

*/
class Cylinder1{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Cha_09_PS_01 {
    public static void main(String[] args) {
          Cylinder myCylinder = new Cylinder();
          myCylinder.setHeight(12);
         // int h = myCylinder.getHeight();
        System.out.println(myCylinder.getHeight());
        System.out.println(9);
        System.out.println(myCylinder.getRadius());


    }
}
