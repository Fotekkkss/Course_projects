package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom","John","Mat","Pault");

        Stream<String> streamNames = names.stream();
        Stream<Integer> steamInt = Arrays.asList(new Integer[]{1,2,3,4,5}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intstream = IntStream.range(1,100);

        //filter - filter
        //map - change element on anything else
        //limit - returns exact amount of elements
        //peek - lets to do operations on each element

        //forEach - action for each element of stream
        //count - amount of elements in stream
        //allMatch - are all elemets ... all restrictions?
        //collect - return new type of stream
        List<String> modifiedNames = streamNames.filter(el ->el.startsWith("T")).map(el->el.toUpperCase()).collect(Collectors.toList());
        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());

        long count = intstream.filter(el->el>20).map(el->el*2).count();
        System.out.println(count);
    }
}
