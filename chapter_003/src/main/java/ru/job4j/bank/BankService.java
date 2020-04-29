package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
         Account account = null;
         if (user != null) {
             List<Account> list = users.get(user);
             for (Account account1 : list) {
                 if (account1.getRequisite().equals(requisite)) {
                     account = account1;
                     break;
                 }
             }
         }
         return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                                   String destRequisite, double amount) {
        boolean rs1 = false;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account account1 = findByRequisite(destPassport, destRequisite);
        if (account != null && account1 != null && account.getBalance() >= amount && amount > 0) {
            account.setBalance(account.getBalance() - amount);
            account1.setBalance(account1.getBalance() + amount);
            rs1 = true;
        }
        return rs1;

    }
}
