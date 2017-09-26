package exercises02.streams;

import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print);
    }
}
