package OOPS.PracticesQuestion;
import java.util.Scanner;
 class complex {
    private double real;
    private double imaginary;

    public  complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }
    public complex add(complex other){
        double sumRreal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return  new complex(sumRreal, sumImaginary);

    }
    public complex subtract(complex other){
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new complex(diffReal, diffImaginary);

    }
    public  complex multiply (complex other){
        double productReal = (this.real * other.real) - (this.imaginary* other.imaginary);
        double productImaginary = ( this.real * this.imaginary)+ (this.imaginary* other.real);
        return new complex(productReal, productImaginary);
        }
        public  void  display(){
            System.out.println(real + " + " + imaginary + "i");
    }
}
//public class ComplexNumberOperations {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the real part of the first complex number: ");
//        double real1 = scanner.nextDouble();
//        System.out.print("Enter the imaginary part of the first complex number: ");
//        double imaginary1 = scanner.nextDouble();
//
//        System.out.print("Enter the real part of the second complex number: ");
//        double real2 = scanner.nextDouble();
//        System.out.print("Enter the imaginary part of the second complex number: ");
//        double imaginary2 = scanner.nextDouble();
//
//        complex complex1 = new complex(real1, imaginary1);
//        complex complex2 = new complex(real2, imaginary2);
//
//        complex sum = complex1.add(complex2);
//        complex difference = complex1.subtract(complex2);
//        complex product = complex1.multiply(complex2);
//
//        System.out.println("Sum: ");
//        sum.display();
//
//        System.out.println("Difference: ");
//        difference.display();
//
//        System.out.println("Product: ");
//        product.display();
//
//     }
// }
