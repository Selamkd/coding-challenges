package com.selamkd.July;

import com.selamkd.July.alternateCapitalization.AlternateCapitalization;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlternateCapitilizationTests {
    

    @Test
    @DisplayName("Given str 'abcdef' should return 'aBcDeF & AbCdEf'")
    void givenStr_Abcdef_ShouldReturn_aBcDeF() {
        String []  expectedOutput = {"AbCdEf","aBcDeF"};
        String [] actualOutput = AlternateCapitalization.capitalize("abcdef");

        Assertions.assertArrayEquals(expectedOutput, actualOutput);

    }

    @Test
    @DisplayName("Given str 'codewars' should return 'CoDeWaRs & cOdEwArS '")
    void givenStr_Abcdef_ShouldReturn_CoDeWaRs() {
        String []  expectedOutput = {"CoDeWaRs","cOdEwArS"};
        String [] actualOutput = AlternateCapitalization.capitalize("codewars");

        Assertions.assertArrayEquals(expectedOutput, actualOutput);

    }

    @Test
    @DisplayName("Given str 'AbRaCaDaBrA' should return 'AbRaCaDaBrA & aBrAcAdAbRa '")
    void givenStr_AbRaCaDaBrA_ShouldReturn_AbRaCaDaBrA () {
        String []  expectedOutput = {"AbRaCaDaBrA","aBrAcAdAbRa"};
        String [] actualOutput = AlternateCapitalization.capitalize("abracadabra");

        Assertions.assertArrayEquals(expectedOutput, actualOutput);

    }

    @Test
    @DisplayName("Given str 'codewarriors' should return 'CoDeWaRrIoRs & 'cOdEwArRiOrS")
    void givenStr_codewarriors_ShouldReturn_CoDeWaRrIoRs() {
        String []  expectedOutput = {"CoDeWaRrIoRs","cOdEwArRiOrS"};
        String [] actualOutput = AlternateCapitalization.capitalize("codewarriors");

        Assertions.assertArrayEquals(expectedOutput, actualOutput);

    }
}
