import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Tests\\Java_git\\Java_git_proj\\src\\test.txt");
            System.out.println("After reading file");
        } catch (FileNotFoundException e) {
            System.out.println("Exception appeared");
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This message appears always, even after catch");
        }

    }


    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
