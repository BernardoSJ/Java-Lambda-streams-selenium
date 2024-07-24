package com.learning.java;

import com.google.common.util.concurrent.Uninterruptibles;
import dev.failsafe.Call;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class TestMainRunnableAndCallable {

    public static void main(String[] args) throws Exception{
        Runnable r = () -> {
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Hello world");
        };

        new Thread(r).start();

        System.out.println("Hi");

        Supplier<Double> random1 = () -> Math.random();
        Callable<Double> random2 = () -> Math.random();

        //System.out.println(random1.get());
        //System.out.println(random2.call());

        test(random2);
    }

    private static void test(Callable callable) throws Exception{
        System.out.println(callable.call());
    }

}
