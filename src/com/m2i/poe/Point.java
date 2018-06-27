package com.m2i.poe;

public class Point {
//    Premiers pas en POO

//    attributs de la classe
    private double x = 0;
    private double y = 0;

    public Point(double x, double y){
        this.setX(x);
        this.setY(y);
    }
    public Point(){

    }
//    Méthodes de la classe

    void moveTo(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public String toString(){
        return "(" + getX() + "," + getY() +")";
    }

    void display(){
        System.out.println("(" + getX() + "," + getY() +")");
    }

    void moveRelative(double x, double y){
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    public double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }
}
