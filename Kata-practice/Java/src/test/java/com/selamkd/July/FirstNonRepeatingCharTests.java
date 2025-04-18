package com.selamkd.July;

import com.selamkd.July.firstnonrepeatingchar.FirstNonRepeatingChar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstNonRepeatingCharTests {


    @Test
    @DisplayName("Given input 'a' should return a")
    void givenInput_a_ShouldReturn_a() {

      String expected = "a";
      String actualOutput = FirstNonRepeatingChar.firstNonRepeatingChar("a");

        Assertions.assertEquals(expected, actualOutput);

    }

    @Test
    @DisplayName("Given input 'streSS' should return t")
    void givenInput_StreSS_ShouldReturn_t() {

        String expected = "t";
        String actualOutput = FirstNonRepeatingChar.firstNonRepeatingChar("streSS");

        Assertions.assertEquals(expected, actualOutput);

    }

    @Test
    @DisplayName("Given input 'moon-men' should return -")
    void givenInput_moonmen_ShouldReturn_() {

        String expected = "-";
        String actualOutput = FirstNonRepeatingChar.firstNonRepeatingChar("moon-men");

        Assertions.assertEquals(expected, actualOutput);

    }

    @Test
    @DisplayName("Given input 'moonmoon' should return empty string")
    void givenInput_moonmoon_ShouldReturn_() {

        String expected = " ";
        String actualOutput = FirstNonRepeatingChar.firstNonRepeatingChar("moonmoon");

        Assertions.assertEquals(expected, actualOutput);

    }
}
