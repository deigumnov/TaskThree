package com.company;

public class Cat extends Super {
    private double treeHeight;
    private boolean isOnTree;

// не предусмотрено создавать котов на деревьях
    public Cat(String type) {
        super(type);
        setMessage("МЯУ");
        this.isOnTree = false;
        this.treeHeight = 0;
    }

    // кот запрыгивает с земли на дерево высотой height
    public String goOnTree(double height) {
        super.setXYZ(super.getX(), super.getY(), super.getZ()+height);
        this.isOnTree = true;
        this.treeHeight = height;
        return "залез на дерево высотой " + height;
    }

// кот спрыгивает с дерева высотой height на землю
    public String jumpFromTree () {
        String result;
        if (this.isOnTree) {
            super.setXYZ(super.getX(), super.getY(), super.getZ()-this.treeHeight);
            result = "слез с дерева высотой " + this.treeHeight;
            this.isOnTree = false;
            this.treeHeight = 0;
        } else {
            result = "находится на земле";
        }
        return result;
    }
}