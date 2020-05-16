package collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] l1= left.split("\\.");
        String[] l2= right.split("\\.");
        System.out.println(Integer.parseInt(l1[0])-Integer.parseInt(l2[0]));
        return Integer.parseInt(l1[0])-Integer.parseInt(l2[0]);

    }





}