package pl.adriankurek;

import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("pl/adriankurek/file.txt");
            int bajt = 0;
            int count = 0;
            
            while((bajt = fis.read()) != -1) {
                System.out.println((String.format("Bajt %s, char: '%s'.", bajt, (char) bajt)));
                count++;
            }
                
            System.out.println(String.format("\nW sumie wczytano %s bajtów.", count));
        } catch(IOException e) {
            System.out.println(String.format("Wystąpił wyjątek IO: %s.", e));
        }
    }
}