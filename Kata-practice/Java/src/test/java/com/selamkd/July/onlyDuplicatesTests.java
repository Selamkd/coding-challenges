package com.selamkd.July;

import com.selamkd.July.onlyduplicates.OnlyDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class onlyDuplicatesTests {
    
    
    @Test
    @DisplayName("Given str 'abccdefee' should return 'ccee'")
    void givenStr_Abccdefee_ShouldReturn_Ccee() {
     String expectedOutput = "cceee";
     String actualOutput = OnlyDuplicates.getOnlyDuplicates("abccdefee");

     Assertions.assertEquals(expectedOutput, actualOutput);
        
    }
    
    
    @Test
    @DisplayName("Given str 'hello' should return 'll'")
    void givenStr_Hello_ShouldReturn_Ll() {

        String expectedOutput = "ll";
        String actualOutput = OnlyDuplicates.getOnlyDuplicates("hello");

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
    
    
    @Test
    @DisplayName("Given str 'colloquial' should return 'c'")
    void givenStr_Colloquial_ShouldReturnC() {

        String expectedOutput = "ollol";
        String actualOutput = OnlyDuplicates.getOnlyDuplicates("colloquial");

        Assertions.assertEquals(expectedOutput, actualOutput);
        
    }
    
    
    @Test
    @DisplayName("Given str 'foundersandcoders should return 'ondersndoders'")
    void givenStr_Foundersandcoders_ShouldReturnOndersndoders(){
        String expectedOutput = "ondersndoders";
        String actualOutput = OnlyDuplicates.getOnlyDuplicates("foundersandcoders");

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
