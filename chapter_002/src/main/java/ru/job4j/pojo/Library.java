package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 685);
        Book book2 = new Book("Clean code", 545);
        Book book3 = new Book("Code Da Vinci", 345);
        Book book4 = new Book("Fathers and sons", 568);
        new Book("TRRECV", 525);
        Book temp;
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("");
        System.out.println("После перестановки");
        System.out.println("");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }


        System.out.println("");
        System.out.println("После сравнением с Clean code");
        System.out.println("");

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }

    }

}
