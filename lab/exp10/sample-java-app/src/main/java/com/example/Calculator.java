package com.example;

public class Calculator {

    public int add(int a, int b) {
        int unused = 0; // code smell
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b; // bug (division by zero)
    }

    public String getName(String name) {
        return name.toLowerCase(); // null pointer risk
    }
}