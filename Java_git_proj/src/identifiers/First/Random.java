package identifiers.First;

public class Random {
    Parent parent = new Parent();
    public void testIdentifiers(){
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth); Private
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        //parent.fourthMethod(); Private
    }
}
