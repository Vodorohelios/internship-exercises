package exercises02.concurrency.parallelstreams;

import java.util.Arrays;

public class ParallelStreamsEx {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5,6)
            .stream()
            .forEach(s -> System.out.print(s+" "));

        System.out.println();

        Arrays.asList(1,2,3,4,5,6)
            .parallelStream()
            .forEach(s -> System.out.print(s+" "));
    }
}
