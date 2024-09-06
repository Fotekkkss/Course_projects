public class IfReminder {
    public static void main(String[] args) {
        double first = 2.4;
        double second = -1;

        if (second > 0){
            System.out.println(first/second);
        } else if (second<= -1) {
            System.out.println("Second number cannot be less than 0");
        } else{
            System.out.println("Cannot be devided by 0");
        }

    }
}
