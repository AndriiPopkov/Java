package org.telran.homework;

import java.util.Scanner;

public class Hw3_27062023 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        Calculator calc = new Calculator();
        int ressum = calc.sum(a,b);
        int resminus = calc.minus(a,b);
        int resmult = calc.mult(a,b);
        double resdiv = calc.div(a,b);
        System.out.println(ressum);
        System.out.println(resminus);
        System.out.println(resmult);
        System.out.println(resdiv);
    }
}
class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int mult(int a, int b) {
        return a * b;
    }
    public double div(int a, int b) {
        double c = a;
        double d = b;
        return c / d;
    }
}