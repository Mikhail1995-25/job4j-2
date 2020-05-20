package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public  void addAccount(String passport, Account account) {
        var user = findByPassport(passport);
        if (user.isPresent()) {
           var list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user
                .getPassport()
                .equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
       var user = findByPassport(passport);
            return  user.isPresent() ?  users.get(user)
                    .stream()
                    .filter(e -> e.getRequisite()
                    .equals(requisite))
                    .findFirst() : Optional.empty();
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                                   String destRequisite, double amount) {
        var rs1 = false;
       var srcAccount = findByRequisite(srcPassport, srcRequisite);
       var destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount && amount > 0) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rs1 = true;
        }
        return rs1;

    }
}
