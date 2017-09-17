package exercises.string;

public class ConcatinationAndImmutability {
    public static void main(String args[]) {
        // string concatination
        System.out.println("string concatination:");
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

        // string immutability example
        System.out.println("string immutability example:");
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}
