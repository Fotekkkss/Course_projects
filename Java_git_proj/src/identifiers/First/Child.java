package identifiers.First;

public class Child extends Parent{
    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth); no access to Private
        firstMethod();
        secondMethod();
        thirdMethod();
        //fourthMethod(); no access to Private
    }
}
