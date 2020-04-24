package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key во всех полях.
     * @param key ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        result.add(new Person("Mikhail", "Pushkarev", "52344", "Nigniy Novgorod"));
        for (Object ob : result) {
            System.out.println(result);
        }
        return result;
    }
}
