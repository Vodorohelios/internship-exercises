package exercises02.dates;

import java.time.ZoneId;

public class DatesEx {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America"))
                .sorted().forEach(System.out::println);
    }
}
