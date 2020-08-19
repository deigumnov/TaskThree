package com.company;

public class Cat extends Object {
    public Cat (double posx, double posy, double posz, String type) {
        moveXYZ(posx,posy,posz);
        setType(type);
        setMessage("МЯУ", "РРР");
    }
}
