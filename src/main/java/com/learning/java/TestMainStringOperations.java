package com.learning.java;

import com.learning.java.lambda.StringOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestMainStringOperations {

    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        //(s) -> s.toUpperCase()
        //(s1, s2) -> s1.concat(s2);
       // StringOperations op1 = String::concat;

        //System.out.println(op1.accept("I am ","learning"));
        StringOperations op1 = list::add;
        op1.accept("I am learning");
        System.out.println(list);
    }



}
