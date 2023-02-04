package com.bridgelabs;

import java.util.Scanner;

public class Squareroot {
    public static void main(String args[])
    {
        int num;
        double a,b,c;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number :\n\n");
        num = scan.nextInt();

        a = Math.pow(num,1);
        b = Math.pow(num,2);
        c = Math.pow(num,3);

        System.out.println("\nOutput Is = " + a + " ,"+ b +" ,"+ c +"\n\n");
    }

}
