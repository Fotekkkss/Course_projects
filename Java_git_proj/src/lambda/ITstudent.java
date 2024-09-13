package lambda;

public class ITstudent implements Student {

    @Override
    public void sayHello(String name) {
        System.out.println("I`m IT guy");
        System.out.println("My name is "+name);
    }
}
