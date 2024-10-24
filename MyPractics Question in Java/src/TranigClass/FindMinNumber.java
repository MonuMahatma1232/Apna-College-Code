package TranigClass;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FindMinNumber {
    public static void main(String[] args) {
        int[][] input = {
                {1, 2, -7},

        };

        System.out.println("smallest Number : " + getMinNumber(input));
    }

    public static int getMinNumber(int[][] array) {
        IntSummaryStatistics stats = Stream.of(array)
                .flatMapToInt(IntStream::of)
                .summaryStatistics();
        return stats.getMin();
    }

}