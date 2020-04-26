package ru.job4j.tracker;

import java.util.*;

public class Tracker {
    /**
     * Мфссив для хранения заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
   // private int position = 0;

    /**
     * Метод добавления заявки  в хранилище.
     * @param item - новая заявка.
     * @return - вернуть заявку.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
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

    public List<Item> findAll() {
        return items;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> list = new ArrayList<>();
        for (Item row : list) {
            if (row.getName().equals(key)) {
                list.add(row);
            }
        }
        return list;
    }

    public Item findById(String id) {
       int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(String id, Item item) {
      int index = indexOf(id);
      boolean rs1 = index != -1;
      if (rs1) {
          item.setId(id);
          items.get(index);
      }
      return rs1;
    }

    private int indexOf(String id) {
        int rs1 = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rs1 = index;
                break;
            }
        }
        return rs1;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index >= 0) {
            items.remove(index);
            return true;
        } else {
            return false;
        }
    }
}
