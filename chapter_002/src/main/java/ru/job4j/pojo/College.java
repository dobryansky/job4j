package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Артём Добрянский");
        student.setGroup(8101);
        student.setDate(new Date(1222020000000L));

        System.out.println( student.getName() +" поступил в колледж " +System.lineSeparator()+  student.getDate()+System.lineSeparator()+ "в группу " +student.getGroup());

    }
}
