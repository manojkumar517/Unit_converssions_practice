package Com.bridgelabz;

import java.util.Scanner;

public class swap {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value of a:");
        int a = scan.nextInt();
        System.out.print("Enter Value of b:");
        int b = scan.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a :"+a);
        System.out.println("Value of a :"+b);
    }
}
