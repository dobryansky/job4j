package collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();

        // for-each origin -> new HashSet.
        for (String orig : origin) {
            check.add(orig);
        }
        // for-each text -> hashSet.contains

        for (String orig : text) {
            rsl = check.contains(orig);
            check.add(orig);
            if (!rsl) {
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String Str = "Разделяем эту строку на слова";
        String Duplicate = "Разделяем на слова эту строку";

        for (String retval : Str.split(" ")) {
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("при помощи Hashset:");

        HashSet<String> check = new HashSet<>();

        for (String hashindex : Str.split(" ")) {
            check.add(hashindex);
            System.out.println(check);
        }
        System.out.println("");
        System.out.println("при помощи Hashset c добавлением другой строки:");
        for (String hashindex : Duplicate.split(" ")) {
            System.out.println(check.contains(hashindex));
            check.add(hashindex);
            System.out.println(check);
        }

    }
}

