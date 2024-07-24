package com.learning.java;

import com.learning.java.calculator.Calculator;
import com.learning.java.lambda.MathOperation;

public class TestMainMathOperation {

    public static void main(String[] args) {

        /*MathOperation add = (a,b) -> a+b;
        MathOperation substract = (a,b) -> a - b;
        MathOperation multiply = (a,b) -> a*b;
        MathOperation divide = (a,b) -> a/b;

        int onScreenNumber = 0;


        onScreenNumber = calculate(5, add, 2);
        onScreenNumber = calculate(onScreenNumber, substract, 3);
        onScreenNumber = calculate(onScreenNumber, multiply, 7);
        onScreenNumber = calculate(onScreenNumber, add, 2);
        onScreenNumber = calculate(onScreenNumber, divide, 3);
        System.out.println(onScreenNumber);*/

        String exp = "5 + 2 - 3 * 7 + 2 / 3";
        //String exp ="";
        System.out.println(
                Calculator.calculate(exp)
        );
    }


}
