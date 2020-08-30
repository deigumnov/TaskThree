package com.company;

public class Dog extends Super implements Swim, MakeSound {
    public Dog(String type) {
        super(type);
        setMessage("ГАВ");
    }

    @Override
    public String swim() { /*  тут могла быть реализация плавания */ return "Не умеет плавать"; }

    @Override
    public String makeSound() {
        if (super.getMessageCount() > 0)
            return super.getMessage(0);
        else
            return "";
    }
}
