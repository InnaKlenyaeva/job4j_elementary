package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sum1(double first, double second) {
        return division(first, second)
                + difference(first, second);
    }

    public static double amount(double first, double second) {
        return division(first, second)
                + difference(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}

