package com.selamkd.June;

import com.selamkd.June.maxdiff.MaxDiff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaxDiffTests {


    @Test
    @DisplayName("Check where all input list is all positive numbers_returns 4")
    void checkWhereAllInputIsPositiveNumbers_Returns4() {
        int [] inputList = {1,2,3,4};
        int output = MaxDiff.maxDiff(inputList);
        Assertions.assertEquals(3,output);

    }

    @Test
    @DisplayName("Check where input list is all negative numbers_returns 30")
    void checkWhereAllInputIsNegativeNumbers_Returns30() {
        int [] inputList = { -4, -5, -3, -1, -31 };
        int output = MaxDiff.maxDiff(inputList);
        Assertions.assertEquals(30,output);

    }

    @Test
    @DisplayName("Check where input list is mix of positive and negative returns 10")
    void checkWhereAllInputIsMixPositiveAndNegativeNumbers_Returns10() {
        int [] inputList = { 1, 2, 3, 4, -5, 5, 4};
        int output = MaxDiff.maxDiff(inputList);
        Assertions.assertEquals(10,output);

    }

    @Test
    @DisplayName("Check where input has one element returns 0")
    void checkWhereInputHasOneElement_returns0() {
        int [] inputList = {1};
        int output = MaxDiff.maxDiff(inputList);
        Assertions.assertEquals(0,output);

    }

    @Test
    @DisplayName("Check where input is empty")
    void checkWhereInputIsEmpty() {
        int [] inputList = {};
        int output = MaxDiff.maxDiff(inputList);
        Assertions.assertEquals(0,output);

    }

}
