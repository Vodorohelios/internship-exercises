package exercises02.io;

import java.io.Console;
public class ConsoleSample {
    public static void main(String[] args) {
        Console console = System.console();
        if(console != null) {
            console.writer().println("Enter something");
            String userInput = console.readLine();
            console.writer().println ("You entered the following: "+userInput);
        }
        else {
            System.out.println("Console is not available.");
        }
    }
}
