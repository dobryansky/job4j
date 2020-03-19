package ru.job4j.ex;

public class FindEl  {
    public  int indexOf(String[] value, String key) throws ElementNotFoundException     {
        int rsl = -1;
        int counter=0;
        for (String i: value){
            if (i.equals(key)){
               rsl++;
               break;
            }
            rsl++;
            counter++;
            if(counter==value.length){
                rsl = -1;
                throw new ElementNotFoundException("There is no elements with such id");
            }
        }
        System.out.println("Индекс равен - "+rsl);
        return rsl;
    }
    public static void main(String[] args) {
        String[] value= {"weqew","wrerwer","dads","dfgdf","fgh","ghjg"};
        FindEl findEl=new FindEl();
        try {
            findEl.indexOf(value, "ghjg");
        }
        catch (ElementNotFoundException e){
            e.printStackTrace();
        }


    }
}
