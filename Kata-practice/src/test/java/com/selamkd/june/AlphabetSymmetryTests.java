package com.selamkd.june;

import com.selamkd.june.alphabetsymmetry.AlphabetSymmetry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlphabetSymmetryTests {

    @Test
    @DisplayName("Given the words {'abode', 'ABc', 'xyz'} return {4,3,1} ")
    void givenTheWords_Abode_ABc_Xyz_Return431() {
        String[] input = {"abode", "ABc", "xyzD"};
        int[] expectedResult =  {4,3,1};
        int[] actualOutput = AlphabetSymmetry.count_letters_in_position(input);

        Assertions.assertArrayEquals(expectedResult,actualOutput);
        
        
    }
}

