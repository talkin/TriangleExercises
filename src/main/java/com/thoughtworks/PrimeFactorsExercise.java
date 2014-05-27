package com.thoughtworks;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 14-5-27
 * Time: 上午9:13
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsExercise {
    public static void main(String[] args) {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);
        System.out.print("Prime factors of number :");
        int n = Integer.parseInt(scanner.next());
        for (Integer integer : generate(n)) {
            System.out.println(integer);
        }
    }

    private static List<Integer> generate(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i=2; i<=n/i; i++) {
            while (n%i == 0) {
                factors.add(i);
                n/=i;
            }
        }
        if (n>1) {
            factors.add(n);
        }
        return factors;

    }
}
