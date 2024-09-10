public class CarTest {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", "S63 AMG", 2022, 12455);

        mercedes.ride();
        mercedes.stop();
        mercedes.info();
    }
}
