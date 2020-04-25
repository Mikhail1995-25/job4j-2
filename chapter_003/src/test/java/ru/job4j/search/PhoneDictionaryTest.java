package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Mikhail", "Pushkarev", "52344", "Nigniy Novgorod"));
        ArrayList<Person> persons = phones.find("Mikhail");
        assertThat(persons.get(0).getSurname(), is("Pushkarev"));
    }

    @Test
    public void whenFindAddress() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Mikhail", "Pushkarev", "54321", "Nigniy Novgorod"));
        ArrayList<Person> persons = phone.find("54321");
        assertThat(persons.get(0).getAddress(), is ("Nigniy Novgorod"));
    }

    @Test
    public void whenFindPhone () {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Mikhail", "Pushkarev", "654321", "Nigniy Novgorod"));
        ArrayList<Person> persons = phone.find("od");
        assertThat(persons.get(0).getName(), is("Mikhail"));
    }
}
