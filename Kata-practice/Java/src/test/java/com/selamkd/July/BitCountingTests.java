package com.selamkd.July;

import com.selamkd.July.bitcounting.BitCounting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BitCountingTests {


    @Test
    @DisplayName("Given num 1234 should return 5")
    void givenNum1234ShouldReturn5() {

        int expectedOutput = 5;

        int actualOutput = BitCounting.countBits(1234);

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Given num 4 should return 1")
    void givenNum4ShouldReturn1() {

        int expectedOutput = 1;

        int actualOutput = BitCounting.countBits(4);

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Given num 7 should return 3")
    void givenNum7ShouldReturn3() {

        int expectedOutput = 3;

        int actualOutput = BitCounting.countBits(7);

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Given num 9 should return 2")
    void givenNum9ShouldReturn2() {

        int expectedOutput = 2;

        int actualOutput = BitCounting.countBits(9);

        Assertions.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    @DisplayName("Given num 10 should return 2")
    void givenNum10ShouldReturn2() {

        int expectedOutput = 2;

        int actualOutput = BitCounting.countBits(10);

        Assertions.assertEquals(expectedOutput, actualOutput);


    }
}
