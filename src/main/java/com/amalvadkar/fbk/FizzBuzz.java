package com.amalvadkar.fbk;

import static java.lang.Integer.parseInt;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;
    public static final int NUMBER_FIVE = 5;
    public static final int NUMBER_THREE = 3;
    public static final String EMPTY_STRING = "";
    public static final char CHARACTER_FIVE = '5';
    public static final char CHARACTER_THREE = '3';

    public String speak(String number) {
        if (hasSingleCharacter(number) && isDivisibleByThreeOrFive(number)) {
            return prepareResultForDivisibleByThreeOrFiveOrBothCase(number);
        }
        String prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase = prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase(number);
        if (hasResult(prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase)) {
            return prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase;
        }
        return number;
    }

    private static boolean hasResult(String prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase) {
        return !prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase.isEmpty();
    }

    private static boolean isDivisibleByThreeOrFive(String number) {
        return isDivisibleByThree(number) || isDivisibleByFive(number);
    }

    private static boolean hasSingleCharacter(String number) {
        return number.length() == 1;
    }

    private static String prepareResultForNumberHasFiveOrThreeAlongWithDivisibleCase(String number) {
        String resultForNumberHasThreeOrFiveInIt = hasFiveOrThreeInIt(number);
        String resultFromDivisibleByThreeOrFive = prepareResultForDivisibleByThreeOrFiveOrBothCase(number);
        return resultForNumberHasThreeOrFiveInIt.concat(resultFromDivisibleByThreeOrFive);
    }

    private static String prepareResultForDivisibleByThreeOrFiveOrBothCase(String number) {
        if (isDivisibleByThreeAndFiveBoth(number)) return FIZZ_BUZZ;
        if (isDivisibleByThree(number)) return FIZZ;
        if (isDivisibleByFive(number)) return BUZZ;
        return EMPTY_STRING;
    }

    private static String hasFiveOrThreeInIt(String number) {
        StringBuilder hasFiveOrThreeResultBuilder = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char currentCharacter = number.charAt(i);
            if (isThree(currentCharacter)) {
                hasFiveOrThreeResultBuilder.append(FIZZ);
            }
            if (isFive(currentCharacter)) {
                hasFiveOrThreeResultBuilder.append(BUZZ);
            }
        }
        return hasFiveOrThreeResultBuilder.toString();
    }

    private static boolean isFive(char currentCharacter) {
        return currentCharacter == CHARACTER_FIVE;
    }

    private static boolean isThree(char currentCharacter) {
        return currentCharacter == CHARACTER_THREE;
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
