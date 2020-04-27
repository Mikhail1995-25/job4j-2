package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("mikhail_pushkarev_1995@mail.ru", "Pushkarev Mikhail Aleksandrovich");
        names.put("mikhail_pushkarev_1995@mail.ru", "Pushkarev Mikhail Aleksandrovich");
        names.remove("mikhail_pushkarev_1995@mail.ru");
        for (String key : names.keySet()) {
            String value = names.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();
        for (Map.Entry<String, String> entry : names.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + " " + value);
        }

    }
}
