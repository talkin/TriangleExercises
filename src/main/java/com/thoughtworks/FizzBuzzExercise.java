package com.thoughtworks;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 14-5-27
 * Time: 上午12:03
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzExercise {
    public static void main(String args[]) {
        System.out.println("FizzBuzz Exercise");
        FizzBuzz();
    }

    private static void FizzBuzz() {
        for (int i=1; i<=100; i++) {
            if ((i%3 == 0) && (i%5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
