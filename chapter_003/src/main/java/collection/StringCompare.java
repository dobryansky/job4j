package collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftlength = left.length();
        int rightlength = right.length();
        int lmin = Math.min(leftlength, rightlength);

        for (int i = 0; i < lmin; i++) {
            int strleft = left.charAt(i);
            int strright = right.charAt(i);
            if (strleft != strright) {
                return strleft - strright;
            }
        }
        return leftlength != rightlength ? leftlength - rightlength : 0;

    }

    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        int result = stringCompare.compare("ABCDEA", "ABCDEF");
        System.out.println(result);


    }


}