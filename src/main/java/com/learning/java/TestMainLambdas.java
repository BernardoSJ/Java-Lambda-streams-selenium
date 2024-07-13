package com.learning.java;

import com.learning.java.lambda.GreetingService;
import com.learning.java.polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;

public class TestMainLambdas {

    public static void main(String[] args) {
        /*
        Lambda Created with multiple parameters
        int a = 5;
        Dog d = new Dog();


        //Lambda Created Yay!!!!
        GreetingService helloService = (name, lastName, age) -> {
            System.out.println("Hello name with uppercase " + name.toUpperCase()+ " " + lastName.toUpperCase());
            System.out.println("Your age "+ age);
        };

        helloService.greet("Bernardo","Salinas",25);*/

        //Lambda created with return parameter and besides impure functions
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("Example");

        GreetingService lambda1 = (name) -> {
            return name.toUpperCase() + list.get(1);
        };

        GreetingService lambda2 = (n) -> {
            list.remove(1);
            return n.toUpperCase();
        };

        System.out.println(lambda1.greet("Bernardo"));

        //Lambda as a pure function
        GreetingService lambda3 = (name) -> name.toUpperCase();

        Dog dog = new Dog();

        dog.makeSound();
        System.out.println(lambda3.greet("Berni"));

        test(lambda3);
        test((name) ->{
            System.out.println(name);
            return name;
        });
    }

    private static void test(GreetingService g){
        String returnString = g.greet("I am learning");
        System.out.println(returnString);
    }

}
