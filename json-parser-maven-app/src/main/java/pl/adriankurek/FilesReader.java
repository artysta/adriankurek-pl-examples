package pl.adriankurek;

import java.io.*;

public class FilesReader {
    public String getFileContent(String path) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            
            while((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sb.toString());
        return sb.toString();
    }
}