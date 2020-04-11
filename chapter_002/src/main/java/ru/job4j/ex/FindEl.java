package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @version 11.04.2020
 * @since 0.1
 */
public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rs1 = -1;
            for (int index = 0; index < value.length; index++) {
                if (value[index].equals(key)) {
                    rs1 = index;
                }
            }
            if (rs1 == -1) {
                throw new ElementNotFoundException("Not found: " + key);
            }
        return rs1;
    }
    public static void main(String[] args) {
        String[] name = {"Vlad", "Lena", "Roma"};
        try {
            indexOf(name, "Natasha");
        }
         catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
