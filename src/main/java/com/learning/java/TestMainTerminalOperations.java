package com.learning.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestMainTerminalOperations {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        //Count function
        System.out.println(list.stream().count());
        //Find first
        Optional<String> op = list.stream()
                                .filter(s -> s.length() >3)
                                .findFirst();

        if(op.isPresent()){
            System.out.println(op.get());
        }

        //Min & Max
        System.out.println(
                list.stream()
                        .min(Comparator.naturalOrder())
                        .get()
        );
        System.out.println(
                list.stream()
                    .filter(s -> s.length() > 3)
                        .noneMatch(s -> s.contains("e"))
        );
    }
}
