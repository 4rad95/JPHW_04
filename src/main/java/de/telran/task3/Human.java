package de.telran.task3;

public class Human implements  Swim{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " swimming. Age " + age);
    }
}
