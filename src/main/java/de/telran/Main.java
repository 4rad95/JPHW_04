package de.telran;

import de.telran.task3.Boat;
import de.telran.task3.Fish;
import de.telran.task3.Human;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Aleksey",29);
        human.swim();

        Fish fish = new Fish("Shark", 357);
        fish.swim();

        Boat boat = new Boat(38);
        boat.swim();
}}