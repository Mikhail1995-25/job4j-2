package ru.job4j.encapsulation;

/**
 * Config
 *
 * @author Mikhail Pushkarev
 * @since 18.03.2020
 * @version 0
 */
public class Config {
    /**
     * Поле с модификатором доступа private, закрытый доступ, им можно пользоваться только  в классе.
     */
    private String name;
    /**
     * Так же поле с модификатором доступа private.
     */
    private int position;
    /**
     * Поле принимает массив от объекта, с закрытым модификатором доступа.
     */
    private String[] properties;

    /**
     * Constructor Config
     * @param name - принимает парметр и записывает значение в поле.
     */
    public Config(String name) {
        this.name = name;
    }

    /**
     * Method print
     * Этот метод выводит на консоль значение поле.
     */
    public void print() {
        System.out.println(position);
    }

    /**
     * Method getPriority
     * @param key - Принимает параметр.
     * @return - возвращает значение в метод search.
     */
    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Method  search - модификатор доступа private.
     * @param key - Принимает параметр.
     * @return - возвращает значение парметра.
     */
    private String search(String key) {
        return key;
    }
}
