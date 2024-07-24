package com.learning.java;

import java.util.function.Function;

public class TestMainFunction {

    public static void main(String[] args) {
        Function<String, Integer> strLen = (s) -> s.length();
        Function<Integer, Integer> square = (i) -> i * i;

        Function<Integer, Integer> plus2 = (i) -> i+2;

        System.out.println(
                //9
                strLen.andThen(square).apply("Hi hello ")
        );

        System.out.println(
                plus2.andThen(square).apply(8)
        );
    }

}
