package Recursion;
        //Remove Duplicates in sting.
// "appnnacollege" // in google microsoft
public class Problems12 {
    public static void removeDuplicate(String str, int idx,StringBuilder newStr, boolean map[]){
       if(idx == str.length()){
           System.out.println(newStr);
           return;
       }
       //kaam
        char currcha = str.charAt(idx);
       if(map[currcha-'a']== true){
           //duplicat
           removeDuplicate(str, idx+1, newStr,map);
       }
       else {
           map[currcha-'a'] = true;
           removeDuplicate(str, idx+1, newStr.append(currcha),map);
       }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

            }



}
