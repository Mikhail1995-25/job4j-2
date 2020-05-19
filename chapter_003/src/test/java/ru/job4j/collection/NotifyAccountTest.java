package ru.job4j.collection;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Mikhail Pushkarev", "ed000mnm"),
                new Account("142", "Mikhail Pushkarev", "00000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Mikhail Pushkarev", "ed000mnm"),
                        new Account("142", "Mikhail Pushkarev", "00000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentDelete() {
        List<Account> accounts = List.of(
                new Account("12345", "Mikhail Pushkarev", "002"),
                new Account("12345", "Mikhail Pushkarev", "002"),
                new Account("123", "Mikhail Pushkarev", "023")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("12345", "Mikhail Pushkarev", "002"),
                        new Account("123", "Mikhail Pushkarev", "023")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
