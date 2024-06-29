package com.selamkd.june;

import com.selamkd.june.Simplecardgame.SimpleCardGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCardGameTests {


    @Test
    @DisplayName("Check Steve wins with a score of 2 to 1")
    void checkSteveWinsWithAScoreOf2To1() {
        String[] steveDeck = {"A", "7", "8"};
        String[] joshDeck = {"K", "5", "9"};

        String output = SimpleCardGame.winner(steveDeck, joshDeck);

        Assertions.assertEquals("Steve wins 2 to 1", output);

    }

    @Test
    @DisplayName("Check Josh wins with a score of 1 to 0")
    void checkJoshWinsWithAScoreOf1To0() {
        String[] steveDeck = {"T", "8"};
        String[] joshDeck = {"T", "9"};

        String output = SimpleCardGame.winner(steveDeck, joshDeck);

        Assertions.assertEquals("Josh wins 1 to 0", output);

    }


    @Test
    @DisplayName("Check when the score is tied it returns Tie")
    void checkWhenTheScoreIsTiedItReturnsTie() {

        String[] steveDeck = {"T"};
        String[] joshDeck = {"T"};

        String output = SimpleCardGame.winner(steveDeck, joshDeck);

        Assertions.assertEquals("Tie", output);

    }
}
