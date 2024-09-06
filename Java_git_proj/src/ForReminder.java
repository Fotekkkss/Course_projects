public class ForReminder {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 0; i <= number; i+=2) {
            if (i%5==0)
                System.out.println(i);
        }
    }
}
