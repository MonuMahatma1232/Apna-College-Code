package STRING;

public class String_Comprasion {
    public static void main(String args[]) {
        String s1 = "Tonny";
        String s2 = "Tonny";
        String s3 = new String("Tonny");

        if (s1 == s2) {
            System.out.println("Stings are equal");
        } else {
            System.out.println("String are not equal");

        }
        if (s1 == s3) {
            System.out.println("String are equal");

            }
            else {
                System.out.println("String are not equal");
            }


        }
    }


