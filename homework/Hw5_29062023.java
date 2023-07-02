package org.telran.homework;

import java.util.Scanner;

public class Hw5_29062023 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        int part1 = a.length()/2;
        int part2 = b.length()/2;
        String result = a.substring(0,part1) + b.substring(part2);
        System.out.println(result);
    }
}

