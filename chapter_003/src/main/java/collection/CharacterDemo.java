package collection;

import java.lang.*;

public class CharacterDemo {

    public static void main(String[] args) {

        // create 2 Character objects c1, c2
        Character c1, c2;

        // assign values to c1, c2
        c1 = new Character('a');
        c2 = new Character('a');

        // create an int type
        int res;

        // compare c1 with c2 and assign result to res
        res = c1.compareTo(c2);

        String str1 = "Both values are equal ";
        String str2 = "First character is numerically greater";
        String str3 = "Second character is numerically greater";

        if( res == 0 ) {
            System.out.println( str1 );
        } else if( res > 0 ) {
            System.out.println( str2 );
        } else if( res < 0 ) {
            System.out.println( str3 );
        }
    }
}