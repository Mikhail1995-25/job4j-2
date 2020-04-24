package ru.job4j.pojo;

import java.util.Date;

/**
 * College
 *
 * @author Pushkarev Mikhail
 * @since 18.03.2020
 * @version 2
 */
public class College {
    /**
     * Main
     * @param args - Принимает параметры и возвращает результат на консоль.
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Pushkarev");
        student.setName("Mikhail");
        student.setPatronymic("Aleksandrovich");
        student.setGroup("intern");
        student.setDate("29.01.2020");
        student.setCreated(new Date());
        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic() + " studying at the stage "
                + student.getGroup() + " receipt date " + student.getDate());
    }
}
