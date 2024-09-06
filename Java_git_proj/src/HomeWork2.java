import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        if (age<18){
            System.out.println("Sorry, you cannot buy it");
        } else if (age>=18 && age<=120) {
            System.out.println("What do you want to buy?");
        }
        else {
            System.out.println("Please, enter correct age");
        }
    }
}
