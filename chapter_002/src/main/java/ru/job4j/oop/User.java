package ru.job4j.oop;

public class User {
    /**
     * переменная объекта, так как эта переменная объявляется в самом классе,
     * и работает  с конкретным объектом.
     */
    private String name;
    /**
     * Эта переменная так же относится к конкретному объекту, так как объявлена в классе.
     */
    private int age;

    public boolean canDrive() {
        boolean can = false; // boolean can - эта переменная локальная, так как обьявляется внутри метода.
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
