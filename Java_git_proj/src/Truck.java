public class Truck implements Vehichle{
    @Override
    public void ride(int speed) {
        System.out.println("Driving truck with his speed: "+speed);
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck! Careful!");
    }

    @Override
    public String info() {
        return "Truck";
    }
    public void refill(){
        System.out.println("Refilling with gas");
    }
}
