package com.learning.java;

import java.util.function.Supplier;

public class TestMainSupplierInterface {

    public static void main(String[] args) {
        Supplier<Double> random =  Math::random;

        System.out.println(random.get());
    }

}
