package com.thoughtworks;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 14-5-26
 * Time: 下午5:27
 * To change this template use File | Settings | File Templates.
 */
public class TriangleExercises {
    public static void main(String[] args) {
        InputStream is = System.in;
        Scanner scan = new Scanner(is);
        int i;

        System.out.println("Triangle Exercises");
        System.out.println("1、Easiest TriangleExercises ever");
        System.out.println("Print one asterisk to the console");
        System.out.println("*");

        System.out.println("\n2、Draw a horizontal line");
        System.out.println("Given a number n,print n asterisks on one line.");
        System.out.print("n :");
        int n2 = Integer.parseInt(scan.next());
        for (i=0; i<n2; i++) {
            System.out.print("*");
        }

        System.out.println("\n\n3、Draw a vertical line");
        System.out.println("Given a number n,print n lines,each with one asterisks.");
        System.out.print("n:");
        int n3 = Integer.parseInt(scan.next());
        for (i=0; i<n3; i++) {
            System.out.println("*");
        }

        System.out.println("\n4、Draw a right triangle");
        System.out.println("Given a number n,print n lines,each with one more asterisk than the last.");
        System.out.print("n:");
        int n4 = Integer.parseInt(scan.next());
        for (i=0; i<n4; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
