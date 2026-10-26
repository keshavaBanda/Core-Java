
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parallel_Stream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        long endPara = System.currentTimeMillis();

        // System.out.println(sum2 + " " + sum3);

        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("Para : " + (endPara - startPara));

        /**
         * para - 1,
         * seq - 1, 1, 1, 1, 1
         */
    }
}
