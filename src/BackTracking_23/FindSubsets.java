package BackTracking_23;

public  class FindSubsets {
    public static void findsubsets1(String str, String ans, int i){
        //base cass
        if(i == str.length()){
           if(ans.length() == 0){
            System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        //yes choice
         findsubsets1(str, ans+str.charAt(i), i+1);
        // No choiced
        findsubsets1(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findsubsets1(str, "",0);

    }
}
