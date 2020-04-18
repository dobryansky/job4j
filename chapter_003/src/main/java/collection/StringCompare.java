package collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l1 = left.length();
        int l2 = right.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = left.charAt(i);
            int str2_ch = right.charAt(i);
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        StringCompare stringCompare= new StringCompare();
        int result = stringCompare.compare("ABCD","ABCDEF");
        //result= Character.compare('A','G');
        System.out.println(result);


    }


}