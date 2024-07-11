package com.learning.java;

import com.learning.java.interfacepolymorphism.Alarm;
import com.learning.java.interfacepolymorphism.Clock;
import com.learning.java.interfacepolymorphism.GoogleMini;
import com.learning.java.interfacepolymorphism.IPhone;
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

       /* Polymorphism without using interface

        Animal d = new Dog();

        test(d);
        d = new Cat();
        test(d);
        d = new Horse();
        test(d);*/

        GoogleMini g = new GoogleMini();
        IPhone i = new IPhone();
        Clock c = new Clock();
        alarmTest(i);
        alarmTest(g);
        alarmTest(c);
    }

    private static void alarmTest(Alarm i) {
        i.setAlarm();
    }

    //Method to use polymorphism without interface
    private static void test(Animal d){
        d.makeSound();
        d.walk();
    }


    public static class TestMainCollections {
    }
}
