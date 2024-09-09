public class UserTest {
    public static void main(String[] args) {

        User user = new User("Aba", "kakie");

        /*user.username = "babis";
        user.password = "qwerty";*/

        System.out.println(user.username);
        System.out.println(user.password);

        user.sayHello();
    }
}
