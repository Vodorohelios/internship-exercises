package exercises.array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
        System.out.println(java.util.Arrays.toString(bugs)); // [cricket, beetle, ladybug]

        // array casting
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//        objects[0] = new StringBuilder(); // careful!

        // sorting
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " "); // 1 6 9

        strings = new String[]{"10", "9", "100"};
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " "); // 10 100 9

        // searching
        numbers = new int[] {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        // multidimensional arrays
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

        int [][] args2 = new int[4][];
        args2[0] = new int[5];
        args2[1] = new int[3];

        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }

        System.out.println("***************");

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
