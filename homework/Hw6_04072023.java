package org.telran.homework;
import javax.sound.sampled.Line;
import java.util.Random;
import java.util.Scanner;

public class Hw6_04072023 {
    public static void main(String[] args) {

        //Задача №1
        Random random = new Random();
        double m = random.nextDouble();
        double n = random.nextDouble();
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        double M = Math.abs(m - 10);
        double N = Math.abs(n - 10);
        if (M < N) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (N < M) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа равноудалены от 10.");
        }
        System.out.println("");

        //Задача №2
        int time = random.nextInt(28800);
        int hours = time / 3600;
        int min = time % 3600 * 60 / 3600;
        System.out.println("До конца рабочего дня осталось: " + (time) + " секунд или "
                + hours + " час" + " и " + min + " мин");
    }
}



