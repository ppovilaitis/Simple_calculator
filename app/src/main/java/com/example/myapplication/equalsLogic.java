package com.example.myapplication;

import org.mariuszgromada.math.mxparser.Expression;

public class equalsLogic {
    public static String calculate(String input) {
        Expression exp = new Expression(input);

        return String.valueOf(exp.calculate());
    }

}
