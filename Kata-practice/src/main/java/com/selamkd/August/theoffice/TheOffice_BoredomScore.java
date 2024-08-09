package com.selamkd.August.theoffice;
import java.util.Map;
import java.util.Arrays;

public class TheOffice_BoredomScore {
    public static String boredom(Person[] staff) {
        Map<String, Integer> teams = Map.of(
                "accounts", 1,
                "finance", 2,
                "canteen", 10,
                "regulation", 3,
                "trading", 6,
                "change", 6,
                "IS", 8,
                "retail", 5,
                "cleaning", 4,
                "pissing about", 25
        );

        int result = Arrays.stream(staff)
                .mapToInt(s -> teams.get(s.department))
                .sum();

        if(result <= 80) {
            return "kill me now";
        } else if(result < 100) {
            return "i can handle this";
        } else {
            return "party time!!";
        }

    }
}