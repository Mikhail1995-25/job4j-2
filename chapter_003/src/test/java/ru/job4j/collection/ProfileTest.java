package ru.job4j.collection;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class ProfileTest {

    @Test
    public void whenAddressResult() {
        List<Profile> list = List.of(
                new Profile(new Address("Нижний Новгород", "Адмирала Макарова", 45, 20)),
                new Profile(new Address("Москва", "Лебедева", 45, 5))
        );
        List<Address> expected = List.of(new Address("Нижний Новгород", "Адмирала Макарова", 45, 20),
                                         new Address("Москва", "Лебедева", 45, 5)
        );
        assertThat(Profile.collect(list).toString(), is(expected.toString()));
    }
}
