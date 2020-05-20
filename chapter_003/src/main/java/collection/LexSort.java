package collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] numleft= left.split("\\.");
        String[] numright= right.split("\\.");
       // return Integer.parseInt(l1[0])-Integer.parseInt(l2[0]);
        return Integer.compare(Integer.parseInt(numleft[0]),Integer.parseInt(numright[0]));

    }





}