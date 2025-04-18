package com.selamkd.June;

import com.selamkd.June.anagramgroups.AnagramGroups;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsTests {


    @Test
    @DisplayName("Given input 'eat, tea , tan , ate , nat , bat ', should return  [[bat],[nat, tan ],[ ate , eat , tea]]")
    void givenInputEatTeaTanAteNatBatShouldReturnBatNatTanAteEatTea() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(List.of("bat"));
        expectedOutput.add(List.of("nat", "tan"));
        expectedOutput.add(List.of("ate", "eat", "tea"));

        List<List<String>> actualOutput = AnagramGroups.groupAnagrams(input);

        Assertions.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    @DisplayName("Given an empty str array should return empty List ")
    void givenAnEmptyStrArrayShouldReturnEmptyList() {
        String[] input = {""};
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(List.of(""));
        List<List<String>> actualOutput = AnagramGroups.groupAnagrams(input);
        Assertions.assertEquals(expectedOutput, actualOutput);

    }


    @Test
    @DisplayName("Given only one char should return the char in List")
    void givenOnlyOneCharShouldReturnTheCharInList() {
        String[] input = {"a"};
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(List.of("a"));
        List<List<String>> actualOutput = AnagramGroups.groupAnagrams(input);
        Assertions.assertEquals(expectedOutput, actualOutput);

    }

}
