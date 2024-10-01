package com.learning.java;

import com.learning.java.comparators.Student;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestMainComparators {

    public static void main(String[] args) {
        Student a = new Student("Bernardo",100,175);
        Student b = new Student("Bob",92,170);
        Student c = new Student("John",87,155);

        Optional<Student> op = Stream.of(a,b,c)
                                        .min(Comparator.comparing(s -> s.getScore()));

        System.out.println(op.get());
    }
}
