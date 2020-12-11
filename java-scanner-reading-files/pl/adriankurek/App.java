package pl.adriankurek;

import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("pl/adriankurek/file.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(String.format("Napotkano problem IO: %s.", e));
        }
    }
}