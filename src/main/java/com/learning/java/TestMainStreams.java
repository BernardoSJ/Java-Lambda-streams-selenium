package com.learning.java;

import java.util.ArrayList;
import java.util.List;

public class TestMainStreams {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("Starting");
        list.stream()
                .peek(i -> System.out.println("Filter received "+i))
                .filter(i -> i%2==0)
                .filter(i -> i > 5)
                //.limit(3)
                //.sorted()
                .peek(i -> System.out.println("Map received "+i))
                .map(i -> i*i)
                .map(i -> i+2)
                //.skip(2)
                .forEach(i -> System.out.println(i));
        System.out.println("Ending");

    }

}
