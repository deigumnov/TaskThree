package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Super> animals = new LinkedList<>();

        animals.add(new Cat("Чеширский кот"));
        animals.add(new Dog("Овчарка"));

        for (Super animal : animals) {
            // все научились рычать
            animal.setMessage("РРР");
            if (animal instanceof Cat) {
                // коты ушли на север
                animal.setXYZ(0, 999, 0);
            } else if (animal instanceof Dog) {
                // собаки ушли на восток
                animal.setXYZ(999, 0, 0);
            } else {
                // неописанный класс улетел
                animal.setXYZ(0, 0, 999);
            }
            for (int j = 0; j < animal.getMessageCount(); j++) {
                if (animal instanceof Cat) {
                    System.out.println("Кот говорит: " + animal.getMessage(j));
                } else if (animal instanceof Dog) {
                    System.out.println("Пес говорит: " + animal.getMessage(j));
                } else {
                    System.out.println("НЛО говорит: " + animal.getMessage(j));
                }
            }
        }

        Cat catSimple = new Cat( "Чеширский кот");
        Dog dogSimple = new Dog("Овчарка");

        catSimple.setXYZ(4,5,0);
        dogSimple.setXYZ(1,2,0);

        System.out.println(catSimple.getType() + catSimple.getXYZ());
        System.out.println(dogSimple.getType() + dogSimple.getXYZ());

        System.out.println("Кот говорит: " + catSimple.getMessage(0));
        System.out.println("Пес говорит: " + dogSimple.getMessage(0));

        System.out.println("Кот " + catSimple.jumpOnTree(5));
        System.out.println("Кот " + catSimple.jumpFromTree());

        System.out.println(catSimple.makeSound());
        System.out.println(dogSimple.makeSound());
    }
}