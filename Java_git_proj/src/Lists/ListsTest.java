package Lists;

import Docs.PDFdocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Ola");
        names.add("Bob");
        names.add("Bob");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println(names.indexOf("Bob"));
        System.out.println(names.lastIndexOf("Bob"));
        System.out.println(names.contains("Ola"));

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(3));

        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);
        System.out.println("--------------------------");

        List<PDFdocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PDFdocument());

        for (int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        for (String justTheVariable : names){
            System.out.println(justTheVariable);
        }

    }
}
