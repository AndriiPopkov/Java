package org.telran.homework;

import java.util.Locale;

public class Hw4_27062023 {
    public static void main(String[] args) {
        String myStr1 = new String("I study Basic Java!");
       
        System.out.println(myStr1.charAt(myStr1.length() - 2));
        boolean java = myStr1.contains("Java");
        System.out.println(java);
        System.out.println(myStr1.substring(0,13) + myStr1.substring(18));
        System.out.println(myStr1.replace("a", "o"));
        System.out.println(myStr1.toUpperCase());
        System.out.println(myStr1.toLowerCase());



    }
}
