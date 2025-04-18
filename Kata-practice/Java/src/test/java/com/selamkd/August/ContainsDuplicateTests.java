package com.selamkd.August;

import com.selamkd.August.containsduplicate.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {

    @Test
    @DisplayName("Given array - [1,2,3,3] should return true")
    void givenArray1233_shouldReturnTrue() {

        boolean actualOutput = ContainsDuplicate.hasDuplicate(new int[] {1,2,3,3});

        Assertions.assertTrue(actualOutput);


    }
    @Test
    @DisplayName("Given array - [1,2,3,4] should return false")
    void givenArray1234_shouldReturnFalse() {

        boolean actualOutput = ContainsDuplicate.hasDuplicate(new int[] {1,2,3,4});

        Assertions.assertTrue(actualOutput);


    }
}
