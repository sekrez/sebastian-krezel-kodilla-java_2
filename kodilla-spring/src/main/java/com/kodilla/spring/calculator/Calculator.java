package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;
    double c;

    public double add(double a, double b) {
        c = a + b;
        display.displayValue(c);
        return c;
    }

    public double sub(double a, double b) {
        c = a - b;
        display.displayValue(c);
        return c;
    }

    public double mul(double a, double b) {
        c = a * b;
        display.displayValue(c);
        return c;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Errror!!!  You can't divide by 0 !");
            double c = Double.POSITIVE_INFINITY;
            display.displayValue(c);
            return c;
        } else {
            c = a / b;
            display.displayValue(c);
            return c;
        }
    }
}
