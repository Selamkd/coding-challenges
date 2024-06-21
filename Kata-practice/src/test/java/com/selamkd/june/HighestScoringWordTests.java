package com.selamkd.june;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.sa.katapractice.june.HighestScoringWord.getHighestScoringWord;

public class HighestScoringWordTests {

    @Test
    @DisplayName("Should return the highest scoring word ")
    void shouldReturnTheHighestScoringWord() {
        // Arrange
        String input = "Vanilla scented candle";
        String expected = "vanilla";
        // Act
        String actual = getHighestScoringWord(input);

        // Assert
        Assertions.assertEquals(expected, actual);

    }
    
    @Test
    @DisplayName("given man i need taxi, should return taxi")
    void givenManINeedTaxiShouldReturnTaxi() {
        // Arrange
        String input = "man i need a taxi up to ubud";
        String expected = "taxi";
        // Act
        String actual = getHighestScoringWord(input);
        // Assert
        Assertions.assertEquals(actual, expected);
        
    }
}
