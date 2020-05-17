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
        //User user = null;
        //for (User key : users.keySet()) {
            //if (key.getPassport().equals(passport)) {
               // user = key;
                //break;
           // }
        //}
        //return user;
        User user = this.users.keySet().stream().filter(user1 -> user1.getPassport().equals(passport)).findFirst().orElse(null);
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
         //Account account = null;
         if (user != null) {
             Account account = users.get(user).stream().filter(e -> e.getRequisite().equals(requisite)).findFirst().orElse(null);
             //  for (Account account1 : list) {
             //  if (account1.getRequisite().equals(requisite)) {
             //   account = account1;
             //   break;
             // }
             //}
             return account;
         }
         return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                                   String destRequisite, double amount) {
        boolean rs1 = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount && amount > 0) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rs1 = true;
        }
        return rs1;

    }
}
