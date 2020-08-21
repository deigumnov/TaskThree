package com.company;

import java.util.LinkedList;

public class SuperClass {
// позиция объекта
    private double posx, posy, posz;
// тип объекта
    private String type;
    private LinkedList<String> message = new LinkedList<String>();
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

    public void setMessage (String ... message) {
        for (int i = 0;i < message.length; ++i) this.message.add(message[i]);
    }

    public int getMessageCount () {
        return this.message.size();
    }

    public String getMessage (int messageNumber) {
        if ((messageNumber >= 0) && (messageNumber < this.message.size())) {
            return message.get(messageNumber);
        } else {
            return "Сообщение не задано";
        }
    }
}
