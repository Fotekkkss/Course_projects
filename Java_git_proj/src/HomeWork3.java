public class HomeWork3 {
    public static void main(String[] args) {

        for (int i = 0; i<100; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }

        int[] table = new int[]{1,3,5,7,9,0};

        for (int i = table.length-1;i>=0;i--){
            System.out.println(table[i]);
        }

    }
}
