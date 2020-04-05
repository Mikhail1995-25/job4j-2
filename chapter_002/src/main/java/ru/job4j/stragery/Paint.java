package ru.job4j.stragery;

/**
 * @author Mikhail Pushkarev
 * @varsion 05.04.2020
 * @since 0.1
 */
public class Paint {

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Paint paint = new Paint();
        paint.draw(triangle);
        System.out.println();
        paint.draw(square);

    }
}
