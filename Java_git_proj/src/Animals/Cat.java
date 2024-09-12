package Animals;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
        sayHello();
        System.out.println("Legs: "+legs);
    }

}
