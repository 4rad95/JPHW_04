package de.telran.task3;

public class Fish implements Swim {
    String name ;
    int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Fish swimming. Fish name "+name+". Fish weight "+weight);
    }
}
