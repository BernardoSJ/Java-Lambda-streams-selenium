package com.learning.java;

import com.learning.java.polymorphism.*;

public class TestMain {

    public static void main(String[] args) {
        /*
        This example is for AreaCalculator example
        AreaCalculator a=new AreaCalculator();

        System.out.println(a.getArea(5));
        System.out.println(a.getArea(5.25));
        System.out.println(a.getArea(4,5));
        System.out.println(a.getArea(4.5,5));

        */
        //Create obj instances
        /*Dog d = new Dog();
        Cat c = new Cat();
        Horse h = new Horse();*/

        Animal d = new Dog();

        test(d);
        d = new Cat();
        test(d);
        d = new Horse();
        test(d);
    }

    private static void test(Animal d){
        d.makeSound();
        d.walk();
    }



}
