package ru.job4j.oop;

/**
 * Cat
 * @author Mikhail Pushkarev
 * @since 08.03.2020
 * @version 0.1
 */
public class Cat {
    private String food;
    private String name;

    /**
     * Method show - Метод выводит содержимое поля.
     */
    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    /**
     * Method eat
     * @param meat - Параметр принимает строку и записывает в поле.
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Method givNick
     * @param nick - Метод так же принимает строку, далее записывает в поле.
     */
    public void giveNick(String nick) {
        this.name = nick;
    }
    /**
     * main
     * @param args - Выводит на консоль результат.
     */
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();


    }
}
