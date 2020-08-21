package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Super {
// координаты объекта X, Y, Z
    private double posX, posY, posZ;
// тип объекта (порода)
    private String type;
// воспроизводимые звуки
    private final LinkedList<String> message = new LinkedList<>();
// создает объект в начале координат с описанием
    Super (String type) {
        setXYZ(0,0,0);
        setType(type);
    }
// движение к X, Y, Z
    public void setXYZ(double posX, double posY, double posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }
// немного уменьшает количество кода в основной программе
    public String getXYZ () {
        String pos = " находится здесь x = " + posX;
        pos += " y = " + posY;
        pos += " z = " + posZ;
        return pos;
    }
// возвращает координаты объекта
    public double getX () { return posX; }
    public double getY () { return posY; }
    public double getZ () { return posZ; }
// устанавливает тип объекта (порода)
    public void setType (String type) { this.type = type; }
// возвращает тип объекта (порода)
    public String getType () { return this.type; }
// добавляет воспроизводимые звуки
    public void setMessage (String ... message) { Collections.addAll(this.message, message); }
// возвращает количество воспроизводимых сообщений
    public int getMessageCount () { return this.message.size(); }
// возвращает воспроизводимые звуки по номеру
    public String getMessage (int messageNumber) {
        String result;
        if ((messageNumber >= 0) && (messageNumber < this.message.size())) {
            result = message.get(messageNumber);
        } else {
            result = "Сообщение не задано";
        }
        return result;
    }
// пока не используется
//    public interface MakeSound {
//        String makeSound ();
//    }
//
//    public interface Swim {
//        String swim ();
//    }
}