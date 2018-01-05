package ru.job4j.Collections.Map;

/**
 * класс User содержит данные о пользователе.
 */
public class User {
    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }
    public User (int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}