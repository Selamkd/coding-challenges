package com.selamkd.june;

import com.selamkd.june.encryptthis.EncryptThis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EncryptThisTests {
    
    
    @Test
    @DisplayName("Given the word 'hello' should return_ 72olle")
    void givenTheWordHelloShouldReturn72Olle() {
     String word = "Hello";
     String expected = "72olle";
     String actualOutput = EncryptThis.encrypt(word);

     Assertions.assertEquals(expected, actualOutput);



        
    }
    @Test
    @DisplayName("Given the word 'good' should return_ 103doo")
    void givenTheWordGoodShouldReturn103doo() {
        String input = "good";
        String expected = "103doo";
        String actualOutput = EncryptThis.encrypt(input);

        Assertions.assertEquals(expected, actualOutput);


    }


    @Test
    @DisplayName("Given the sentence 'hello world' should return _ 1040lle 119drlo")
    void givenTheSentenceHelloWorldShouldReturn1040Lle119Drlo() {

        String input = "hello world";
        String expected = "104olle 119drlo";
        String actualOutput = EncryptThis.encrypt(input);

        Assertions.assertEquals(expected, actualOutput);

    }
    
    
    @Test
    @DisplayName("Given the sentence 'A wise old owl lived in an oak' should return _ 65 119esi 111dl 111lw 108dvei 105n 97n 111ka ")
    void givenTheSentenceAWiseOldOwlLivedInAnOakShouldReturn65119Esi111Dl111Lw108Dvei105N97N111Ka() {

        String input = "A wise old owl lived in an oak";
        String expected = "65 119esi 111dl 111lw 108dvei 105n 97n 111ka";
        String actualOutput = EncryptThis.encrypt(input);

        Assertions.assertEquals(expected, actualOutput);
        
    }


    @Test
    @DisplayName("Given an empty string should return empty string ")
    void givenAnEmptyStringShouldReturnEmptyString() {
        String input = "";
        String expected = "";
        String actualOutput = EncryptThis.encrypt(input);

        Assertions.assertEquals(expected, actualOutput);

    }


}
