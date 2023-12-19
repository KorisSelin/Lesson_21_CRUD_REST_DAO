package ru.spring.models;

public class Person {
    private int id;
    private String name;

    public Person(int id, String nsme) {
        this.id = id;
        this.name = nsme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nsme) {
        this.name = nsme;
    }
}
