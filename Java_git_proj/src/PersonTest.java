public class PersonTest {
    public static void main(String[] args) {

        MathTeacher teacher = new MathTeacher("Alexa", 66, "Harvard");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teach();

        Footballer footballer = new Footballer("Mike", 21, "Juventus");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
