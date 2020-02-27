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
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
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

     int findById(String id) {
        int result = -1;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }

    }
