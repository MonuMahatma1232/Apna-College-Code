package TranigClass;
import java.awt.geom.Point2D;



    public class QuadrilateralAreaCalculator {
        // Method to calculate the area of a convex quadrilateral
        public static double calculateArea(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
            // Create Point2D objects for the four vertices
            Point2D.Double point1 = new Point2D.Double(x1, y1);
            Point2D.Double point2 = new Point2D.Double(x2, y2);
            Point2D.Double point3 = new Point2D.Double(x3, y3);
            Point2D.Double point4 = new Point2D.Double(x4, y4);

            // Calculate the area of the quadrilateral using the shoelace formula
            double area = 0.5 * Math.abs(
                    (point1.getX() * point2.getY() + point2.getX() * point3.getY() + point3.getX() * point4.getY() +
                            point4.getX() * point1.getY()) -
                            (point2.getX() * point1.getY() + point3.getX() * point2.getY() + point4.getX() * point3.getY() +
                                    point1.getX() * point4.getY())
            );

            return area;
        }

        public static void main(String[] args) {
            // Example usage:
            double x1 = 0.0;
            double y1 = 0.0;
            double x2 = 1.0;
            double y2 = 0.0;
            double x3 = 1.0;
            double y3 = 1.0;
            double x4 = 0.0;
            double y4 = 1.0;

            double area = calculateArea(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println("The area of the quadrilateral is: " + area);
        }
    }


