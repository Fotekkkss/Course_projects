package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNext()){
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }
}
