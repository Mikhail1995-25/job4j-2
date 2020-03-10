package ru.job4j.oop;

/**
 * BallStory
 * @author Mikhail Pushkarev
 * @since 09.03.2020
 * @version 1.6
 */
public class BallStory {
    /**
     * Main
     * @param args - Выводит на консоль историю объектов классов.
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolfs wolfs = new Wolfs();
        hare.tryEat(ball);
        fox.tryEat(hare);
        wolfs.tryEat(fox);
        ball.help(wolfs);
    }

}
