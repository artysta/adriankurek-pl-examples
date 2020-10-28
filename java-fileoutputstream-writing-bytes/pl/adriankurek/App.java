package pl.adriankurek;

import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("pl/adriankurek/file.txt");
            byte[] name = {65, 100, 114, 105, 97, 110}; // Adrian
            fos.write(name);

            System.out.print("Pomyślnie zapisano tekst \"");
            for (int i = 0; i < name.length; i++) {
                System.out.print((char) name[i]);
            }
            System.out.println("\".");
        } catch (IOException e) {
            System.out.println(String.format("Błąd IO: %s.", e));
        }
    }
}