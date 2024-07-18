package com.learning.java;

import com.learning.java.lambda.GreetingService;
import com.learning.java.polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

        //Another example
        String s = "Bernardo";
        covertToUpperCase(s);

        //Example with other functions
        System.out.println("Starting execution how the lambda works");
        //receiveNumber(getNumber());
        test(n -> {
            System.out.println("Inside Lambda");
            return n.toUpperCase();
        });
        System.out.println("Ending another execution");

        //Call lambda from a function
        String ss= getLambda().greet("dataExample");
        System.out.println(ss);
    }

    private static GreetingService getLambda(){
        GreetingService g = (s) -> s.toUpperCase();
        return g;
    }

    private static void covertToUpperCase(String s){
        String returnedString = s.toUpperCase();
        System.out.println("Text in uppercase "+returnedString);
    }


    private static void test(GreetingService g){
        System.out.println("Inside Text method. Receive greeting service");
        String returnString = g.greet("I am learning");
        System.out.println(returnString);
    }

    private static int getNumber(){
        System.out.println("Called getNumber");
        return 1;
    }

    private static void receiveNumber(int n){
        System.out.println("Receive number is "+n);
    }

}
