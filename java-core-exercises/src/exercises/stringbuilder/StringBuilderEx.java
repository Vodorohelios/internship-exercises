package exercises.stringbuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b); // a and b reference to the same object4
    }
}
