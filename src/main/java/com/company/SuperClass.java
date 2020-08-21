package com.company;

public class SuperClass {
// позиция объекта
    private double posx, posy, posz;
// тип объекта
    private String type;
//  максимальное количество сообщений задано статично 100 штук
    private String [] message = new String[100];
// текущее количество сообщений
    private int messageCount;

    public void setXYZ(double posx, double posy, double posz) {
        this.posx = posx;
        this.posy = posy;
        this.posz = posz;
    }

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

    public void setType (String type) { this.type = type; }

    public String getType () {return this.type; }

    public boolean setMessage (String ... message) {
        boolean check = true;
        if (message.length > this.message.length) check = false;
        else {
            messageCount = message.length;
            for (int i = 0;i < messageCount; ++i) this.message[i] = message[i];
        }
        return check;
    }

    public int getMessageCount () {
        return messageCount;
    }

    public String getMessage (int messageNumber) {
        if ((messageNumber >= 0) && (messageNumber < messageCount)) {
            return message[messageNumber];
        } else {
            return "Сообщение не задано";
        }
    }
}
