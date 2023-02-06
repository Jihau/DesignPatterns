package Singleton;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSingleton {
    private static FileReaderSingleton instance;

    private FileReaderSingleton() {}

    public static FileReaderSingleton getInstance() {
        if (instance == null) {
            instance = new FileReaderSingleton();
        }
        return instance;
    }

    public void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();
    }
}