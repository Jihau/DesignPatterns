package Singleton;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "cats.txt";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        FileReaderSingleton fileReaderSingleton = FileReaderSingleton.getInstance();
        try {
            fileReaderSingleton.readFile(fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
