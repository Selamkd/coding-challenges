package com.selamkd.July;

import com.selamkd.July.TimeFormatter.TimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimeFormatterTests {


    @Test
    @DisplayName("Given int 1 _ should return 1 second")
    void givenInt1_ShouldReturn1Second() {

        String expectedOutput = "1 second";
        String actualOuput = TimeFormatter.formatDuration(1);

        Assertions.assertEquals(expectedOutput, actualOuput);


    }


    @Test
    @DisplayName("Given int 62 should return 1 minute and 2 seconds")
    void givenInt62_ShouldReturn1MinuteAnd2Seconds() {
        String expectedOutput = "1 minute and 2 seconds";
        String actualOuput = TimeFormatter.formatDuration(62);

        Assertions.assertEquals(expectedOutput, actualOuput);

    }


    @Test
    @DisplayName("Given int 120 should return 2 minutes")
    void givenInt120_ShouldReturn2Minutes() {
        String expectedOutput = "2 minutes";
        String actualOuput = TimeFormatter.formatDuration(120);

        Assertions.assertEquals(expectedOutput, actualOuput);

    }


    @Test
    @DisplayName("given int 3600 should return 1 hour")
    void givenInt3600_ShouldReturn1Hour() {
        String expectedOutput = "1 hour";
        String actualOuput = TimeFormatter.formatDuration(3600);

        Assertions.assertEquals(expectedOutput, actualOuput);

    }


    @Test
    @DisplayName("Given int 3662 should return 1 hour 1 minute and 2 seconds")
    void givenInt3662_ShouldReturn1Hour1MinuteAnd2Seconds() {
        String expectedOutput = "1 hour, 1 minute and 2 seconds";
        String actualOuput = TimeFormatter.formatDuration(3662);

        Assertions.assertEquals(expectedOutput, actualOuput);



    }
}
