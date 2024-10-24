package STRING;

public class Palindrom {
    public  static  boolean isPalindrome(String str){
        for(int i=0; i <str.length()/2; i++){
            int n = str.length();
          if (str.charAt(i) == str.charAt(n-1-i)){
           // not a plindrom
              return true;
          }
        }
        return false;

    }
    public static void main(String args[]){
        String str = "moon";
        System.out.println(isPalindrome(str));

    }

}
