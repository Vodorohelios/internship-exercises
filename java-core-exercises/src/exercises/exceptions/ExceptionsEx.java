package exercises.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsEx {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            System.out.println("Inside outer try catch");
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
                System.out.println("Inside inner try catch");
            }
        }
    }

    private static FileReader read() throws IOException {
        throw new IOException();
    }
}
