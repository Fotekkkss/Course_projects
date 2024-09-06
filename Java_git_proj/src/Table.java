public class Table {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Igor";
        names[1] = "Peter";
        names[2] = "Bob";

        int[] lotto = new int[]{1,2,3,4,5,6};
        System.out.println(lotto[1]);
        System.out.println(lotto.length);

        for (int i = 0; i<lotto.length;i++){
            System.out.println(names[i]);
        }

    }
}
