package com.amalvadkar.ck.fizzbuzz;

public class FizzBuzz {
    public String speak(String number) {

        if (Integer.parseInt(number) % 3 == 0) {
            return "Fizz";
        }

        if (Integer.parseInt(number) % 5 == 0) {
            return "Buzz";
        }

        return number;
    }
}
