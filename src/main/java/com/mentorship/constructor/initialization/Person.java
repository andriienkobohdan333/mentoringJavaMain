package com.mentorship.constructor.initialization;

/*
Завдання: Створіть клас Person з конструктором, який використовує this для розрізнення параметрів конструктора та полів класу.
Клас повинен мати наступні поля: name, age. Додайте метод display Info, щоб вивести інформацію про об'єкт.
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, String age, String nameOfParent){

    }

    public void displayInfo(){
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
    }


}
