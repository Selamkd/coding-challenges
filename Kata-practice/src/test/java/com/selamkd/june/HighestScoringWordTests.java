package com.selamkd.june;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.selamkd.june.HighestScoringWord.getHighestScoringWord;


public class HighestScoringWordTests {

    @Test
    @DisplayName("Should return the highest scoring word ")
    void shouldReturnTheHighestScoringWord() {

        String input = "Vanilla scented candle";
        String expected = "vanilla";
        String actual = getHighestScoringWord(input);


        Assertions.assertEquals(expected, actual);

    }
    
    @Test
    @DisplayName("given man i need taxi, should return taxi")
    void givenManINeedTaxiShouldReturnTaxi() {

        String input = "man i need a taxi up to ubud";
        String expected = "taxi";

        String actual = getHighestScoringWord(input);

        Assertions.assertEquals(actual, expected);
        
    }
}
