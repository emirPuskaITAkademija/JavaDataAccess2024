package org.example.one;

import java.io.Serializable;

public class Person implements Serializable {

    private transient String socialSecurityNumber;
    private String name;
    private String surname;
    private int age;

    public Person() {
    }

    public Person(String socialSecurityNumber, String name, String surname, int age) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
