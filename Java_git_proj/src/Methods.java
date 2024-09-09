public class Methods {
    int result = 0;
    public void progression(){
        for (int i = 0; i < 100; i++){
            result += i;
        }
        System.out.println(result);
    }
    public int getResult(){
        for (int i = 0; i < 100; i++){
            result += i;
        }
        return (result);
    }
    int result_for_param = 0;
    public int getResultParam(int number){
        System.out.println("Number is " + number);
        for (int i = 0; i < number; i++){
            result_for_param += i;
        }
        return (result_for_param);
    }

    public void add(int first_number, int second_number) {
        System.out.println("Summ is: " + (first_number+second_number));

    }
}