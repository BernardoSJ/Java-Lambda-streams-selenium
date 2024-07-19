package com.learning.java;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestMainConsumerInterface {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bernardo");
        list.add("Salinas");

        Consumer<String> c1= (str) ->{
            System.out.println("I am writing in the DB "+str);
        };

        Consumer<String> loggingConsumer= (str) ->{
            System.out.println("I am writing in log file "+str);
        };

        Consumer<String> dbLogConsumer = c1.andThen(loggingConsumer);


        BiConsumer<String,Integer> biConsumer = (s,i)-> {
            System.out.println("name "+s+" age "+i);
        };


        //biConsumer.accept("Bernardo",25);

       Map<String, Consumer<String>> map =new HashMap<>();

        map.put("db", c1);
        map.put("log", loggingConsumer);
        map.put("dblog",dbLogConsumer);
        map.forEach((k,v) ->{
            System.out.println("Key is "+k);
        });

        //list.forEach(map.get(System.getProperty("consumer-type")));

    }

}
