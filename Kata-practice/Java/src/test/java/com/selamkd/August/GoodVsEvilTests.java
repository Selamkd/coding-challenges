package com.selamkd.August;

import com.selamkd.August.goodvsevil.GoodVsEvil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoodVsEvilTests {

    @Test
    @DisplayName("Good wins - should return:'Good triumphs over Evil'")
    void goodWins_ShouldReturn_GoodTriumphsOverEvil() {
        String goodAmounts = "0 0 0 0 0 10";
        String evilAmounts = "0 1 1 1 1 0 0";
        String expectedOutput = "Battle Result: Good triumphs over Evil";
        String actualOutput = GoodVsEvil.battle(goodAmounts, evilAmounts);

        Assertions.assertEquals(actualOutput, expectedOutput);


    }
    @Test
    @DisplayName("Evil wins - should return:'Evil eradicates all trace of Good'")
    void evilWins_ShouldReturn_EvilEradicatesAllTracesOfGood() {
        String goodAmounts = "1 1 1 1 1 1";
        String evilAmounts = "1 1 1 1 1 1 1";
        String expectedOutput = "Battle Result: Evil eradicates all trace of Good";
        String actualOutput = GoodVsEvil.battle(goodAmounts, evilAmounts);

        Assertions.assertEquals(actualOutput, expectedOutput);
    }
    
    
    @Test
    @DisplayName("It's a tie - should return: 'Battle Result: No victor on this battle field'")
    void itSATieShouldReturnBattleResultNoVictorOnThisBattleField() {

        String goodAmounts = "1 0 0 0 0 0";
        String evilAmounts = "1 0 0 0 0 0 0";
        String expectedOutput = "Battle Result: No victor on this battle field";
        String actualOutput = GoodVsEvil.battle(goodAmounts, evilAmounts);

        Assertions.assertEquals(actualOutput, expectedOutput);
        
    }
}
