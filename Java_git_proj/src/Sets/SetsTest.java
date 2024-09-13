package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetsTest {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());


        Set<String> vegetables = new HashSet<>();
        vegetables.add("potatoes");
        vegetables.add("onion");

        System.out.println(vegetables.size());
        for (String fruitsDisplay : fruits){
            System.out.println(fruitsDisplay);
        }
    }
}
