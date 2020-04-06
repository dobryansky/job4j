package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for(Task index:list){
           numbers.add(index.getNumber());

        }
        return numbers;
    }

}
