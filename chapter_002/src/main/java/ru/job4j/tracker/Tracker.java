package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private static final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param newitem новая заявка
     */
    public Item add(Item newitem) {
        newitem.setId(this.generateId());
        this.items[position] = newitem;
        this.position++;
        return newitem;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
            Random rm = new Random();
            return String.valueOf(rm.nextLong() + System.currentTimeMillis());
        }

    public Item[] findAll(){
        return Arrays.copyOf(items, position);
    }


    public Item[] findByName(String key){
        Item[] itemsCopy = new Item[100];
        int counter = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                itemsCopy[counter] = this.items[i];
                counter++;
            }
        }

        return Arrays.copyOf(itemsCopy, counter);


    }


    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
            if (current.getId().equals(id)) {
                item = current;
                break;
            }
        }
        return item;
    }

    public static void main(String[] args) {


        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item item4 = new Item("test4");
        Item item5 = new Item("test5");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
       /* tracker.findAll();
        tracker.add(item2);
        tracker.add(item3);
        //Item result = tracker.findById(item1.getId());
        tracker.findByName("test1");
        tracker.findById(item2.getId());
        System.out.println("name="+item1.getName());
        System.out.println("id="+item1.getId());
        System.out.println("position = "+tracker.position);
        System.out.println("");
        System.out.println("name="+item2.getName());
        System.out.println("id="+item2.getId());
        System.out.println("position = "+tracker.position);
        System.out.println("");
        System.out.println("name="+item3.getName());
        System.out.println("id="+item3.getId());
        System.out.println("position = "+tracker.position);*/
        tracker.findByName("test1");
       for (int i=0;i<5;i++){
           System.out.println(items[i].getName());
           System.out.println(items[i].getId());
           System.out.println("");
       }


    }

    }
