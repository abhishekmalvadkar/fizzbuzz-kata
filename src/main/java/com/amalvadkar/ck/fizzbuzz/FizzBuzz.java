package com.amalvadkar.ck.fizzbuzz;

public class FizzBuzz {
    public String speak(String number) {

        if (isDivisibaleByThree(number)) {
            return "Fizz";
        }

        if (isDivisibaleByFive(number)) {
            return "Buzz";
        }

        return number;
    }

    private static boolean isDivisibaleByFive(String number) {
        return Integer.parseInt(number) % 5 == 0;
    }

    private static boolean isDivisibaleByThree(String number) {
        return Integer.parseInt(number) % 3 == 0;
    }
}
