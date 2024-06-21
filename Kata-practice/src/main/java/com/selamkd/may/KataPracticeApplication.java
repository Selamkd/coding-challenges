package com.selamkd.may;

import static com.selamkd.may.CountVowelsAndConsonants.countVowelsAndConsonants;


public class KataPracticeApplication {

    public static void main(String[] args) {

        int[] counts = countVowelsAndConsonants("Hello World");
        System.out.println("Vowels: " + counts[0] + " " + "Consonants : " + counts[1]);
    }

}
