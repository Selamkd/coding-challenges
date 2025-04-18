package com.selamkd.August.theoffice;

public class TheOffice_Outed {

    public static String outed(Person[] meet, String boss) {
        int happinessRating = 0;
        for(Person person: meet){
            if(person.name.equals(boss)){
                int bossScore = person.happiness * 2;
                happinessRating+= bossScore;
            }

            happinessRating+= person.happiness;
        }

        happinessRating = happinessRating / meet.length;
        if(happinessRating <= 5){
            return "Get Out Now!";
        }else {
            return "Nice Work Champ!";
        }
    }

}
