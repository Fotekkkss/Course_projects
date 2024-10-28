package BDDdef;

public class Task {

    private String name;
    private String value;
    private String status;


    public Task(String name, String value, String status){
        this.name= name;
        this.status = status;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
