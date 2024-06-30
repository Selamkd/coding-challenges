package com.selamkd.May;

import static com.selamkd.May.CountVowelsAndConsonants.countVowelsAndConsonants;


public class KataPracticeApplication {

    public static void main(String[] args) {

        int[] counts = countVowelsAndConsonants("Hello World");
        System.out.println("Vowels: " + counts[0] + " " + "Consonants : " + counts[1]);
    }

}
