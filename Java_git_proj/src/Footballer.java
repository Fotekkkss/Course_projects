public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }
    public void eat(){
        System.out.println("I like healthy food");
    }
    public void playFootball(){
        System.out.println("I`m playing football");
    }
}
