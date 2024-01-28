package de.telran.task3;

public class Boat implements Swim{
    int speed;

    public Boat(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Boat swimming, speed "+speed);
    }
}
