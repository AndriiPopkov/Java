package org.telran.homework;

import java.util.Scanner;

public class Hw3_27062023 {
    public static void main(String[] args) {
        float myFl1;
        float myFl2;
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Input number 1 = ");
        myFl1 = myscanner.nextFloat();
        System.out.print("Input number 2 = ");
        myFl2 = myscanner.nextFloat();
        System.out.println("Сумма = "  + (myFl1 + myFl2));
        System.out.println("Вычетание = "  + (myFl1 - myFl2));
        System.out.println("Деление = "  + (myFl1 / myFl2));
        System.out.println("Произведение = "  + (myFl1 * myFl2));
    }
}
