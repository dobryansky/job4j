package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng)
    {
        String sound = "Неизвестное слово - " + eng;
        return sound;
    }

    public static void main (String[] args) {
        DummyDic hz=new DummyDic();
        String say = hz.engToRus(" roll");
        System.out.println(say);

    }


}
