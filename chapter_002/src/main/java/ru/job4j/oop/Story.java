package ru.job4j.oop;

/**
 * Story
 * @author Mikhail Pushkarev
 * @since 09.03.2020
 * @version 1.6
 */
public class Story {
    /**
     * Main
     * @param args - Выводит на консоль историю объектов.
     */
    public void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);

    }
}
