package invalidAgeExceptionHomework;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Please, enter your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age<18&&age>=0){
            System.out.println("Hello child");
        } else if (age>=18) {
            System.out.println("Hello, adult");
        } else {
            throw new InvalidAgeException("Age cannot be lower that 0");
        }

    }
}
