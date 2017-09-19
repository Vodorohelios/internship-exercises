package exercises.inheritance;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        // static method Panda.eat() hides parent static method bear.eat()
        Panda.eat();
    }
}
