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
}
