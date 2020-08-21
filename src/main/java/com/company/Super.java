package com.company;

import java.util.LinkedList;

public class Super {
// координаты объекта X, Y, Z
    private double posX, posY, posZ;
// тип объекта (порода)
    private String type;
// воспроизводимые звуки
    private final LinkedList<String> message = new LinkedList<>();

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

    public double getX () {
        return posX;
    }

    public double getY () {
        return posY;
    }

    public double getZ () {
        return posZ;
    }

// устанавливает тип объекта (порода)
    public void setType (String type) { this.type = type; }

// возвращает тип объекта (порода)
    public String getType () {return this.type; }

// добавляет воспроизводимые звуки
    public void setMessage (String ... message) {
        int thisMessageSize = this.message.size();
        for (int i = thisMessageSize;i < message.length+thisMessageSize; ++i) this.message.add(message[i]);
    }

// возвращает количество воспроизводимых сообщений
    public int getMessageCount () {
        return this.message.size();
    }

// возвращает воспроизводимые звуки по номеру
    public String getMessage (int messageNumber) {
        if ((messageNumber >= 0) && (messageNumber < this.message.size())) {
            return message.get(messageNumber);
        } else {
            return "Сообщение не задано";
        }
    }
}