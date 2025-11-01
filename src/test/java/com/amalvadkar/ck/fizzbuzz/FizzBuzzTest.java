package com.amalvadkar.ck.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void should_return_1_if_input_is_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String response = fizzBuzz.speak("1");
        assertThat(response).isEqualTo("1");
    }

    @Test
    void should_return_2_if_input_is_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.speak("2")).isEqualTo("2");
    }

    @Test
    void should_return_Fizz_if_input_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.speak("3")).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_if_input_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.speak("5")).isEqualTo("Buzz");
    }

    @Test
    void should_return_FizzBuzz_if_input_is_divisible_by_3_and_5_both() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.speak("15")).isEqualTo("FizzBuzz");
    }
}
