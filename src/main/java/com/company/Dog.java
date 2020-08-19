package com.company;

public class Dog extends Object {
    public Dog (double posx, double posy, double posz, String type) {
        moveXYZ(posx,posy,posz);
        setType(type);
        setMessage("ГАВ", "РРР");
    }
}
