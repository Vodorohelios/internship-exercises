package exercises02.io;

import java.io.*;
public class SystemInSample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter something");
        String userInput = reader.readLine();
        System.out.println("You entered the following: "+userInput);
    }
}
