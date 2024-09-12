package Animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Whoof");
        sayHello();
        System.out.println("Legs: "+legs);
    }
}
