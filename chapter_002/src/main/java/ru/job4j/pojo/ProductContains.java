package ru.job4j.pojo;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("Bread",100);
        Product second= new Product("Bread",100);
        boolean equal= first.equals(second);
        System.out.println(equal);
    }
}
