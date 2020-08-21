package com.company;

public class Cat extends Super {
    public Cat (double posx, double posy, double posz, String type) {
        setXYZ(posx,posy,posz);
        setType(type);
        setMessage("МЯУ", "РРР");
    }

    public String setXYZ(double height) {
        super.setXYZ(super.getX(), super.getY(), height);
        return "залез на дерево высотой " + String.valueOf(height);
    }
}
