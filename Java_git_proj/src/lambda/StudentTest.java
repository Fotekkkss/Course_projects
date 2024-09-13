package lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ITstudent();
        sayHello("John", it);

        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I will be a doctor");
                System.out.println("My name is "+name);
            }
        };
        sayHello("Bora", med);


        Student noStudent = name-> {
            System.out.println("I`m not a student, My name is "+name);
            System.out.println("Hi again");
        };
        sayHello("Tom", noStudent);


    }
    public static void sayHello(String name, Student student){
        student.sayHello(name);
    }
}
