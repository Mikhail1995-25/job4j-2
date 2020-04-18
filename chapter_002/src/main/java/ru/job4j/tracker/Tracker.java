package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Tracker {
    /**
     * Мфссив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки  в хранилище.
     * @param item - новая заявка.
     * @return - вернуть заявку.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * так как у заявки нет уникальности  полей, имени и описание. Для идентификации нужен уникальный ключ.
     * @return - Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                result[size++] = items[index];
            }
        }
        return Arrays.copyOf(result, size);
    }

    public Item findById(String id) {
       int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(String id, Item item) {
      int index = indexOf(id);
      boolean rs1 = index != -1;
      if (rs1) {
          item.setId(id);
          items[index] = item;
      }
      return rs1;
    }

    private int indexOf(String id) {
        int rs1 = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rs1 = index;
                break;
            }
        }
        return rs1;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
        }
        return result;
    }
}
