import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int trials = 1000;
        int n = 2;
        int[] numbers = {2, 1, 2, 3, 4, 5};

        LongStream.Builder measures = LongStream.builder();
        for (int i = 0; i < trials; i++) {
            long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
            main.group(n, numbers);
            measures.add(ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start);
        }

        System.out.println("Time: " + measures.build().max().getAsLong() + "ns");
    }

    public List<int[]> group(int n, int[] nums) {
        return new ArrayList<>();
    }
}
