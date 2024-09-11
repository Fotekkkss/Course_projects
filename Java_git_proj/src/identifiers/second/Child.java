package identifiers.second;

import identifiers.First.Parent;

public class Child extends Parent {
    public void testIdentifiers(){
        System.out.println(first);
        //System.out.println(second); no access to default
        System.out.println(third);
        //System.out.println(fourth); no access to Private
        firstMethod();
        //secondMethod(); no access to default
        thirdMethod();
        //fourthMethod(); no access to Private
    }
}
