package ru.job4j.max;

/**
 * Reduce
 *
 * @author Mikhail Pushkarev
 * @since 16.03.2020
 * @version 5.1
 */
public class Reduce {
    /**
     * Мы создали поле со схожим именем локальной переменной в методе to,
     * поле у нас может работать во всех методах класса, а локадьная переменная
     * только в методе, где она находится.
     * Ошибка у нас была в методе to, мы передаем поле в метод и присваиваем этому полю локальную переменную,
     * так как у нас поле и переменная одинаковые по имени, компилятор не понимает какой переменной передать значения.
     * Мы изменяем название поля и пробуем зановго запустить код, все работает.
     */
    private int[] array;
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Method print.
     *
     * В этом методе находится цикл for, в теле цикла находится метод println, для выполнения результата на конслоь.
     */
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    /**
     * Main
     * @param args - принимает параметр, для вывода на консоль.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
