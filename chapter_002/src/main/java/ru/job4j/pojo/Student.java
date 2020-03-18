package ru.job4j.pojo;

import java.util.Date;

/**
 * Student
 *
 * @author Mikhail Pushkarev
 * @since 18.03.2020
 * @version 2
 */
public class Student {
    /**
     * Поля для описания через объект.
     */
    private String surname;
    private String name;
    private String patronymic;
    private String group;
    private String date;
    private Date created;

    /**
     * Method get and set - для записи информации в метод set и для возврата из метода get.
     * @return - возвращает результат на консоль.
     */

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
