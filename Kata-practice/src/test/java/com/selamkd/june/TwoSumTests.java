package com.selamkd.june;

import com.selamkd.june.twosum.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TwoSumTests {


    @Test
    @DisplayName("given array [1,2,3] and target is 4_should return 0 and 2")
    void givenArray123AndTargetIs4ShouldReturn0And2() {

         int[] input = {1,2,3};
         int target = 4;

         int[] expectedOutput = {0,2};
         int[] actualOutput = TwoSum.twoSum(input, target);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("given array [3,2,4] and target is 6_should return 1 and 2")
    void givenArray324AndTargetIs6ShouldReturn1And2() {

        int[] input = {3,2,4};
        int target = 6;

        int[] expectedOutput = {1,2};
        int[] actualOutput = TwoSum.twoSum(input, target);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
    @Test
    @DisplayName("given array [1234,5678,9012] and target is 14690_should return 1 and 2")
    void givenArray1234_5678_9012AndTargetIs14690ShouldReturn1And2() {

        int[] input = {1234,5678,9012};
        int target = 14690;

        int[] expectedOutput = {1,2};
        int[] actualOutput = TwoSum.twoSum(input, target);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("given array [2,2,3] and target is 4_should return 0 and 1")
    void givenArray223AndTargetIs4ShouldReturn0And1() {

        int[] input = {2,2,3};
        int target = 4;

        int[] expectedOutput = {0,1};
        int[] actualOutput = TwoSum.twoSum(input, target);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}
