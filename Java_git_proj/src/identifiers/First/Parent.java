package identifiers.First;

public class Parent {
    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";

    public void firstMethod(){
        System.out.println("Public");
    }
    void secondMethod(){
        System.out.println("Default");
    }
    protected void thirdMethod(){
        System.out.println("Protected");
    }
    private void fourthMethod(){
        System.out.println("Private");
    }

    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
