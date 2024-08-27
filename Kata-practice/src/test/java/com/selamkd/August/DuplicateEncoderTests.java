package com.selamkd.August;

import com.selamkd.August.duplicate_encoder.DuplicateEncoder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DuplicateEncoderTests {
    
    @Test
    @DisplayName("given input din should return (((")
    void givenInputDin_ShouldReturn() {
       String input = "din";
       String expectedOutput = "(((";
       String actualOutput = DuplicateEncoder.encode(input);

       Assertions.assertEquals(expectedOutput, actualOutput);
        
    }


    @Test
    @DisplayName("given input recede should return () () ()")
    void givenInputRecede_ShouldReturn() {
        String input = "recede";
        String expectedOutput = "()()()";
        String actualOutput = DuplicateEncoder.encode(input);

        Assertions.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    @DisplayName("given input Success should return )())())")
    void givenInputSuccess_ShouldReturn() {
        String input = "Success";
        String expectedOutput = ")())())";
        String actualOutput = DuplicateEncoder.encode(input);

        Assertions.assertEquals(expectedOutput, actualOutput);

    }
    @Test
    @DisplayName("given input (( @ should return ))((")
    void givenInput_ShouldReturn() {
        String input = "(( @";
        String expectedOutput = "))((";
        String actualOutput = DuplicateEncoder.encode(input);

        Assertions.assertEquals(expectedOutput, actualOutput);

    }
    @Test
    @DisplayName("given input Prespecialized should return )()())()(()()(")
    void givenInputPrespecialized_ShouldReturn() {
        String input = "Prespecialized";
        String expectedOutput = ")()())()(()()(";
        String actualOutput = DuplicateEncoder.encode(input);

        Assertions.assertEquals(expectedOutput, actualOutput);

    }
}
