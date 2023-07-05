package org.telran.homework;
import javax.sound.sampled.Line;
import java.util.Random;
import java.util.Scanner;

public class Hw6_04072023 {
    public static void main(String[] args) {

        //Задача №1
        Random random = new Random();
        double m = random.nextDouble()+random.nextInt();
        double n = random.nextDouble()+random.nextInt();
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
        String text = "";
        if ((hours < 1) || (hours >= 5)) text = "часов";
        if (hours == 1) text = "час";
        if ((hours >= 2) && (hours < 5)) text = "часа";
        int min = time % 3600 * 60 / 3600;
        String minT = "";
        if (min % 10 == 1) minT = "минута";
        if ((min % 10 == 2) || (min % 10 == 3) || (min % 10 == 4)) minT = "минуты";
        if ((min % 10 == 5) || (min % 10 == 6) || (min % 10 == 7) || (min % 10 == 8) || (min % 10 == 9) || (min == 0))
            minT = "минут";
        if ((min > 9) && (min < 21)) minT = "минут";
        else minT = "минут";
        System.out.println("До конца рабочего дня осталось: " + (time) + " секунд или "
                + hours + " " + text + " и " + min + " " + minT);
    }
}
// ТЕСТ
//https://docs.google.com/document/d/1xcCpWLVMpT4T-AipsOOIe3ubiYzv5clD/edit?usp=sharing&ouid=111669083725926797036&rtpof=true&sd=true





