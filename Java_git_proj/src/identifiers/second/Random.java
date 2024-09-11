package identifiers.second;

import identifiers.First.Parent;

public class Random {
    Parent parent = new Parent();
    public void testIdentifiers(){
        System.out.println(parent.first);
        //System.out.println(parent.second);default
        //System.out.println(parent.third); protected
        //System.out.println(parent.fourth); Private
        parent.firstMethod();
        //parent.secondMethod();default
        //parent.thirdMethod(); protected (no access from another package wihtout extending parent class)
        //parent.fourthMethod(); Private
    }
}
