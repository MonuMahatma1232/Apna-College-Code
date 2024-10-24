package CodeWithHarry.Chapter_03_String.PracticsSet03;

public class Ch_03_CN_03 {
    public static void main(String[] args) {
        String latter = "Dear <|name|>, Thanks a lot!";
        latter = latter.replace("<|name|>", "Abhimanyu");
        System.out.println(latter);
    }
}
