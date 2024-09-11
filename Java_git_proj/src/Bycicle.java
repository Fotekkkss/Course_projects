public class Bycicle implements Vehichle{

    @Override
    public void ride(int speed) {
        System.out.println("Riding bike with "+speed);
    }

    @Override
    public void stop() {
        System.out.println("Stopping bike. Pressing brake!");
    }

    @Override
    public String info() {
        return "Bicycle";
    }
    public void refill(){
        System.out.println("I need to get energy from eat");
    }
}
