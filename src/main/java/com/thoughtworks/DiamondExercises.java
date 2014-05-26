package com.thoughtworks;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 14-5-26
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 */
public class DiamondExercises {
    public static void main(String args[]) {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);
        int i,j;

        System.out.println("Diamond Exercises");
        System.out.println("Isosceles Triangle");
        System.out.println("Given a number n,print a centered triangle.");
        System.out.print("n:");
        int n1 = Integer.parseInt(scanner.next());
        for (i=1; i<=n1; i++) {
            for (j=0; j<n1-i; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Diamond");
        System.out.println("Given a number n,print a centered diamond.");
        System.out.print("n:");
        int n2 = Integer.parseInt(scanner.next());
        for (i=1; i<=n2; i++) {
            for (j=0; j<=n2-i; j++) {
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=2; i<=n2; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (j=0; j<=2*(n2-i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Diamond with Name");
        System.out.println("Given a number,print a centered diamond with your name in the place of middle line");
        System.out.print("n:");
        int n3 = Integer.parseInt(scanner.next());
        for (i=1; i<n3; i++) {
            for (j=0; j<=n3-i; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        if (i==n3) {
            System.out.print("taojing\n");
        }
        for (i=2; i<=n3; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (j=0; j<=2*(n3-i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
