package com.amalvadkar.ck.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String speak(String number) {

        if (isDivisibaleByThree(number)) return FIZZ;
        if (isDivisibaleByFive(number)) return BUZZ;

        return number;
    }

    private static boolean isDivisibaleByFive(String number) {
        return Integer.parseInt(number) % 5 == 0;
    }

    private static boolean isDivisibaleByThree(String number) {
        return Integer.parseInt(number) % 3 == 0;
    }
}
