package STRING;
public class string_rocj01 {
    public  static String substring(String str, int s1, int e1) {
        String Substr = "";
        for (int i = s1; i < e1; i++) {
            Substr += str.charAt(i);
        }
        return Substr;

    }
    public static void main(String args[]){
//        Substring;
        String str = "HelloWorld";
        //System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0, 5));
    }

}

