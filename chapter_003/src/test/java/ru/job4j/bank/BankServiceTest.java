package ru.job4j.bank;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BankServiceTest {

    @Test
    public void addUser() {
        var user = new User("3434", "Mikhail Pushkarev");
        var service = new BankService();
        service.addUser(user);
        assertThat(service.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        var user = new User("3434", "Mikhail Pushkarev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        var user = new User("3434", "Mikhail Pushkarev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        var user = new User("3434", "Mikhail Pushkarev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), is(200D));
    }
}
