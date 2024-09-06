public class Switch {
    public static void main(String[] args) {
        String meal = "Fish";

        switch (meal){
            case "Fish":
                System.out.println("Price is 20zl.");
                break;
            case "Meat":
                System.out.println("Price is 18zl");
                break;
            case "Fries":
                System.out.println("Price is 9zl");
                break;
            default:
                System.out.println("No meal in system");
        }
    }
}
