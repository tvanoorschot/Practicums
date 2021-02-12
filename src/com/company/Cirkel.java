package com.company;

public class Cirkel {

    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        if (rad <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        } else {
            this.radius = rad;
        }
        this.yPositie = y;
        this.xPositie = x;
    }

    public String toString(){
        return "cirkel (" + this.xPositie + ", " + this.yPositie  + ") met radius: " + this.radius;
    }
}
