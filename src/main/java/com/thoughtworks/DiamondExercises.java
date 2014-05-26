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
        int i;

        System.out.println("Diamond Exercises");
        System.out.println("Isosceles Triangle");
        System.out.println("Given a number n,print a centered triangle.");
        System.out.print("n:");
        int n1 = Integer.parseInt(scanner.next());
        for (i=1; i<=n1; i++) {
            for (int j=0; j<n1-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
