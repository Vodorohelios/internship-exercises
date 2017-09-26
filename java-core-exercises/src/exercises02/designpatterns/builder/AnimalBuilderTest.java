package exercises02.designpatterns.builder;

import exercises02.designpatterns.immutableobjects.Animal;

import java.util.Arrays;

public class AnimalBuilderTest {
    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder
                .setAge(4)
                .setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");
        Animal duck = duckBuilder.build();
        Animal flamingo = new AnimalBuilder()
                .setFavoriteFoods(Arrays.asList("algae", "insects"))
                .setSpecies("flamingo").build();
    }
}
