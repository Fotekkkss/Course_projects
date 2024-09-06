import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        System.out.println("Please, enter first number ");
        Scanner scan = new Scanner(System.in);
        int first_number = Integer.parseInt((scan.nextLine()));
        System.out.println("Please, enter second number ");
        int second_number = Integer.parseInt(scan.nextLine());
        int result_minus = first_number - second_number;
        double result_dec = (double) first_number / second_number;
        System.out.println("+ = " + first_number+second_number);
        System.out.println("- = " + result_minus);
        System.out.println("* = " + first_number*second_number);
        System.out.println("/ = " + result_dec);
        System.out.println("% = " + first_number%second_number);


    }
}
