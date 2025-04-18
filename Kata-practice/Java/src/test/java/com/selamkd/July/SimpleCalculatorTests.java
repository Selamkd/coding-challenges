package com.selamkd.July;

import com.selamkd.July.SimpleCalculator.SimpleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTests {


    @Test
    @DisplayName("Step 1: given num 0 should return empty string")
    void givenNum0_ShouldReturnEmptyString() {

        int expectedOutput = 0;
        int actualOutput = SimpleCalculator.add("");

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Step 1: given num 4 should return 4")
    void givenNum4_ShouldReturn4() {

        int expectedOutput = 4;
        int actualOutput = SimpleCalculator.add("4");

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Step 1: given num 1 & 2 should return 3")
    void givenNum1N2_ShouldReturn3() {

        int expectedOutput = 3;
        int actualOutput = SimpleCalculator.add("1,2");

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Step 2: given arbitrary number size should return sum")
    void givenArbitraryNumSizeShouldReturnSum() {

        int expectedOutput = 45;
        int actualOutput = SimpleCalculator.add("1,2,3,4,5,6,7,8,9");

        Assertions.assertEquals(expectedOutput, actualOutput);


    }
}
