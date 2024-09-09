public class CarTest {
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.mark = "Mercedes";
        mercedes.model = "S63 AMG";
        mercedes.year = 2022;
        mercedes.distance_driven = 12000;

        mercedes.ride();
        mercedes.stop();
        mercedes.info();
    }
}
