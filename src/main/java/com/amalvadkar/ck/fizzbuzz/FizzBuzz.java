package com.amalvadkar.ck.fizzbuzz;

import static java.lang.Integer.parseInt;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;
    public static final int NUMBER_FIVE = 5;
    public static final int NUMBER_THREE = 3;

    public String speak(String number) {

        if(isDivisibleByThreeAndFiveBoth(number)) return FIZZ_BUZZ;
        if (isDivisibleByThree(number)) return FIZZ;
        if (isDivisibleByFive(number)) return BUZZ;

        return number;
    }

    private static boolean isDivisibleByThreeAndFiveBoth(String number) {
        return isDivisibleByThree(number) && isDivisibleByFive(number);
    }

    private static boolean isDivisibleByFive(String number) {
        return parseInt(number) % NUMBER_FIVE == 0;
    }

    private static boolean isDivisibleByThree(String number) {
        return parseInt(number) % NUMBER_THREE == 0;
    }
}
