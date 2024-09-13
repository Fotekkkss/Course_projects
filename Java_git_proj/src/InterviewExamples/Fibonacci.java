package InterviewExamples;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(22);
    }
    public static void fibonacci(int lengh){
        int n1 = 1;
        int n2 = 1;
        int valueOfNs;
        for (int i=3;i<=lengh;i++){
            int temp = n1+n2;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n2);
    }
}
