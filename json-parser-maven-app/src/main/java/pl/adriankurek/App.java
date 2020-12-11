package pl.adriankurek;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        String path = ".\\users.json";

        FilesReader reader = new FilesReader();
        String jsonString = reader.getFileContent(path);

        JSONParser parser = new JSONParser();
        List<User> users = parser.getUsers(jsonString);
        
        for (User u : users) {
            System.out.println(u.toString());
        }
    }
}