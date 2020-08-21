package com.company;

import org.graalvm.compiler.api.replacements.Snippet;

import java.util.LinkedList;

public class Super {
// координаты объекта X, Y, Z
    private double posx, posy, posz;
// тип объекта (порода)
    private String type;
// воспроизводимые звуки
    private LinkedList<String> message = new LinkedList<>();

    public void setXYZ(double posx, double posy, double posz) {
        this.posx = posx;
        this.posy = posy;
        this.posz = posz;
    }

// немного уменьшает количество кода в основной программе
    public String getXYZ () {
        String pos = "x = " + posx;
        pos += " y = " + posy;
        pos += " z = " + posz;
        return pos;
    }

    public double getX () {
        return posx;
    }

    public double getY () {
        return posy;
    }

    public double getZ () {
        return posz;
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