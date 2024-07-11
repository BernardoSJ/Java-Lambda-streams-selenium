package com.learning.java.polymorphism;

public class AreaCalculator {

    public int getArea(int side){
        return side * side;
    }

    public double getArea(double side){
        return side * side;
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public double getArea(double length, double width){
        return length * width;
    }
}
