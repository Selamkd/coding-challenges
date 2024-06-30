package com.selamkd.June;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.selamkd.June.highestscoringword.HighestScoringWord.getHighestScoringWord;


public class HighestScoringWordTests {

    @Test
    @DisplayName("Given 'Vanilla scented candle' should return - vanilla")
    void shouldReturnTheHighestScoringWord() {

        String input = "Vanilla scented candle";
        String expected = "vanilla";
        String actual = getHighestScoringWord(input);


        Assertions.assertEquals(expected, actual);

    }
    
    @Test
    @DisplayName("given 'man i need taxi', should return taxi")
    void givenManINeedTaxiShouldReturnTaxi() {

        String input = "man i need a taxi up to ubud";
        String expected = "taxi";

        String actual = getHighestScoringWord(input);

        Assertions.assertEquals(actual, expected);
        
    }
    @Test
    @DisplayName("given 'take me to semynak', should return semynak")
    void givenTakeMeToSemynakShouldReturnSemynak() {

        String input = "take me to semynak";
        String expected = "semynak";

        String actual = getHighestScoringWord(input);

        Assertions.assertEquals(actual, expected);

    }
}
