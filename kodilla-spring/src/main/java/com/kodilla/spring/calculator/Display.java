package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Display {

    public void displayValue (double val) {
        System.out.println("Wyniczek operacji to " + val);
    }


}
