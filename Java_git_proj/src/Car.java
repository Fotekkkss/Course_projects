public class Car {
    public String mark;
    public String model;
    public int year;
    public int distance_driven;

    public void ride(){
        System.out.println("Drive!");
    }
    public void stop(){
        System.out.println("Stop!");
    }

    public void info(){
        System.out.println("Mark: " + mark);
        System.out.println("Model: " + model);
        System.out.println("Year of roduction: " + year);
        System.out.println("Disrance driven km: " + distance_driven);
    }
}
