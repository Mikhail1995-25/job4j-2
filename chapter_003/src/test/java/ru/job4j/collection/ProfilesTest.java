package ru.job4j.collection;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class ProfilesTest {

    @Test
    public void whenAddressResult() {
        List<Profile> list = List.of(
                new Profile(new Address("Нижний Новгород", "Адмирала Макарова", 45, 20)),
                new Profile(new Address("Москва", "Лебедева", 45, 5))
        );
        List<Address> expected = List.of(new Address("Нижний Новгород", "Адмирала Макарова", 45, 20),
                                         new Address("Москва", "Лебедева", 45, 5)
        );
        assertThat(Profiles.collect(list).toString(), is(expected.toString()));
    }

    @Test
    public void whenSortedCity() {
        List<Address> list = List.of(
                new Address("Нижний Новгород", "Адмирала Макарова", 45, 20),
                new Address("Москва", "Лебедева", 45, 5),
                new Address("Чебоксары", "Новопокровская", 10, 19)
        );
        List<Address> result = Profiles.collector(list);
        List<Address> expected = List.of(
                new Address("Москва", "Лебедева", 45, 5),
                new Address("Нижний Новгород", "Адмирала Макарова", 45, 20),
                new Address("Чебоксары", "Новопокровская", 10, 19)
        );

        assertThat(result.toString(), is(expected.toString()));
    }
}
