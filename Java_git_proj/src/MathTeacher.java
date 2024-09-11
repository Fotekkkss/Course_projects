public class MathTeacher extends  Person{

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void teach(){
        walk();
        eat();
        System.out.println("I`m teacher");
    }
    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I`m "+age);
    }
    public void walk(){
        super.walk();
        System.out.println("Walking very fast");
    }
}
