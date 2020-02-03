package ru.job4j.condition;
/*
public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first>second){
            if(first>third){
                if(first>forth){
                    result=first;
                }
                else result=forth;
            }
            else if(third>forth){
                result=third;
            }
            else result=forth;
        }
        else if (second>third){
            if(second>forth){
                result= second;
            }
            else result=forth;
        }
        else if(third>forth){
            result=third;
        }


        else result=forth;
        return result;
    }

}

 */
public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result,result1,result2;
        if (second>first){ result1=second; }
        else {result1=first;}

        if (third>forth){ result2=third; }
        else {result2=forth;}
        if (result1 > result2){ result=result1; }
        else {result=result2;}
        return result;
    }
}