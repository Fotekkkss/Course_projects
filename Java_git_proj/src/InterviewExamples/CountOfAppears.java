package InterviewExamples;

import java.util.HashMap;
import java.util.Map;

public class CountOfAppears {
    public static void main(String[] args) {

        countOccurences(new int[]{1,2,3,2,5,3});
    }
    public static void countOccurences(int[] numbers){
        Map<Integer, Integer> occurences= new HashMap<>();

        for (int i=0;i<numbers.length;i++){
            if (occurences.containsKey(numbers[i])){
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i], value+1);
            }else {
                occurences.put(numbers[i],1);
            }
        }
        for (Integer key : occurences.keySet()){
            System.out.println("Number "+key+" appears "+occurences.get(key));
        }
        System.out.println("Amount of elements: "+occurences.size());
    }
}
