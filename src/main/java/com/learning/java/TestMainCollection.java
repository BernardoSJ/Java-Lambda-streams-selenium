package com.learning.java;

import java.util.ArrayList;
import java.util.List;

public class TestMainCollection {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        findMax(l);
    }

    private static void findMax(List<Integer> list){
        int max =  list.get(0);
        for(int i = 1;i < list.size(); i++){
            if(list.get(i) > max){
                max =  list.get(i);
            }
        }
        System.out.println(max);
    }

}
