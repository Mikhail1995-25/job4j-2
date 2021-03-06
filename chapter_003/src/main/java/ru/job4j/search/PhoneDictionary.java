package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> predicate = person -> person.getName().contains(key) || person.getSurname().contains(key);
        Predicate<Person> predicate1 = person -> person.getAddress().contains(key) || person.getPhone().contains(key);
        var combine = predicate.or(predicate1);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
