package exercises.stringbuilder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // charAt(), indexOf(), length(), and substring()
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        // append()
        System.out.println();
        sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

        // insert()
        System.out.println();
        sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);

        // delete() and deleteCharAt()
        System.out.println();
        sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        sb.deleteCharAt(3); // sb = ade
        System.out.println(sb);

        // reverse()
        System.out.println();
        sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);

        // toString()
        System.out.println();
        String s = sb.toString();
        System.out.println(s);
    }
}
