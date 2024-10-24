package CodeWithHarry.Cha_09_AcceModifire.PracticsSet_09;
/**
 Use © to calculate surface area and Volume
 of the Cylinder.
 */
class Cylinder{
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
    public void setHeight(int height){
        this.height = height;
    }
   /* public int surfaceAre(){
        return 2*3.14* radius * radius + 2 * 3.14 * radius*/
    }
//}
    public class Ch_09_02 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        // int h = myCylinder.getHeight();
        System.out.println(myCylinder.getHeight());
        System.out.println(9);
        System.out.println(myCylinder.getRadius());
    }
}
