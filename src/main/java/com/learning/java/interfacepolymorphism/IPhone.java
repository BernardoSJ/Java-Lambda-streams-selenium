package com.learning.java.interfacepolymorphism;

public class IPhone implements Alarm{

    public void dial(){
        System.out.println("Calling 123");
    }

    public void answerPhone(){
        System.out.println("Hello");
    }

    public void setAlarm(){
        System.out.println("Iphone Setting alarm");
    }

}
