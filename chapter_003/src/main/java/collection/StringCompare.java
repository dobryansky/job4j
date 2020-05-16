package collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l1 = left.length();
        int l2 = right.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1ch = left.charAt(i);
            int str2ch = right.charAt(i);
            if (str1ch != str2ch) {
                return str1ch - str2ch;
            }
        }
        return l1 != l2 ? l1 - l2 : 0;

    }

    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        int result = stringCompare.compare("ABCDEA", "ABCDEF");
        System.out.println(result);


    }


}