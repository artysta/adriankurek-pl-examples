package pl.adriankurek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pl/adriankurek/file.txt"))) {
            String textToWrite = "Jakiś tekst do zapisania.";
            writer.write(textToWrite);
            System.out.println(String.format("Z powodzeniem zapisano tekst: \"%s\".", textToWrite));
        } catch(IOException e) {
            System.out.println(String.format("Wystąpił problem IO: %s.", e));
        }
    }
}