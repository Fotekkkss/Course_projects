import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();

        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int first_number = Integer.parseInt(scan.nextLine());
        System.out.println("Enter second number: ");
        int second_number = Integer.parseInt(scan.nextLine());


        System.out.println("Result of plus method: " + calculate.plus(first_number, second_number));
        System.out.println("Result of minus method: " + calculate.minus(first_number, second_number));
        System.out.println("Result of multiplier method: " + calculate.multiplicate(first_number,second_number));
        System.out.println("Result of devie method: " + calculate.devide(first_number,second_number));
        System.out.println("Result of mod method: " + calculate.mod(first_number,second_number));
    }
}