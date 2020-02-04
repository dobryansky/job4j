/* package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        int f=0; //счетчик кол-ва false в массиве
        int t=0; //счетчик кол-ва true в массиве
        for (int i=0;i<data.length;i++) {
            if (data[i])
            {
                t++;
            }
            else
            {
                f++;
            }
         }
        if ((f==data.length)||(t==data.length))              //если кол-во false или колво true равно длине массива, значит result=true
        {
            result=true;
        }

        return result;
    }
}

 */

package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;

        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
               result = false;
               break;
            }

        }


        return result;
    }
}