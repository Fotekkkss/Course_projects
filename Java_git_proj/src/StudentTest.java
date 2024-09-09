public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student first_student = new Student();
        Student secon_student = new Student();
        Student third_strudent = new Student();


        first_student.name = "Bob";
        first_student.surname = "Maze";
        first_student.email = "bob.maze@gmail.com";
        first_student.login = "BMMB";
        first_student.index = 1;

        secon_student.name = "Alex";
        secon_student.surname = "Ale";
        secon_student.login = "ALAL";

        third_strudent.name = "BR";
        third_strudent.email = "dawdawdadawdawdawdaw@gmail.com";
        third_strudent.index = 3;

        students[0] = first_student;
        students[1] = secon_student;
        students[2] = third_strudent;

        for (int i = 0; i < students.length; i++){
            students[i].present_yourself();
            students[i].log_in();
            students[i].getIndexNumber();
            students[i].getEmailAddress();
        }

    }
}
