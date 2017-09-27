package exercises02.generics;

class Elephant {
}

class Robot {
}

public class GenericsEx {
    public static void main(String[] args) {
        // class with one generic parameter
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
        Robot atDestination = robotCrate.emptyCrate();

        // class with two generic paramters
        elephant = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(
                elephant, numPounds);

        // generic method
        crateForElephant = Crate.ship(elephant);
        inNewHome = crateForElephant.emptyCrate();
    }
}
