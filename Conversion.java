package com.bridgelabz;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        /*
         *constants for inch, meter and centimeter in 1 kilometer .
         */
        double INCH = 39370.0787;
        double CENTIMETER = 100000;
        double METER = 1000;

        Scanner in = new Scanner(System.in);
        /* Read kilometer input from user */
        System.out.println("Enter length in kilometers : ");
        double km = in.nextDouble();

        /* Convert km into inch, cm and km */
        double inch = km * INCH;
        double m = km * METER;
        double cm = km * CENTIMETER;

        /* print result on console */
        System.out.println(km + " km is equal to " + inch + " inches.");
        System.out.println(km + " km is equal to " + m + "meters.");
        System.out.println(km + " km is equal to " + cm + "centimeters");
    }
}