package pl.adriankurek;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        String name = scanner.nextLine();
        
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        
        System.out.println(String.format("Twoje imię to %s. Masz %s lat.", name, age));
    }
}