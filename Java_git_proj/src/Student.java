public class Student {
    public String name;
    public String surname;
    public String login;
    public String email;
    public int index;

    public void present_yourself(){
        System.out.println("I`m " + name + " " + surname);
    }
    public void log_in(){
        System.out.println("Login with " + login);
    }
    public void getIndexNumber(){
        System.out.println("My index is " + index);
    }
    public void getEmailAddress(){
        System.out.println("My email is " + email);
    }
}
