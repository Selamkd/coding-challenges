package com.selamkd.june;

import com.selamkd.june.anagramgroups.AnagramGroups;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTests {


   @Test
   @Disabled
   @DisplayName("Given input 'eat, tea , tan , ate , nat , bat ', should return  [[bat],[nat, tan ],[ ate , eat , tea]]")
   void givenInputEatTeaTanAteNatBatShouldReturnBatNatTanAteEatTea() {
    String [] input = {"eat","tea", "tan", "ate", "nat", "bat"};
    List<List<String>> expectedOutput = new ArrayList<>();
    expectedOutput.add(List.of("bat"));
    expectedOutput.add(List.of("nat","tan"));
    expectedOutput.add(List.of("ate","eat","tea"));

    List<List<String>> actualOutput = AnagramGroups.groupAnagrams(input);

    Assertions.assertEquals(expectedOutput, actualOutput);

   }

}
