package com.selamkd.August.goodvsevil;
import java.util.Map;

public class GoodVsEvil {
    public static void main(String[] args) {
        System.out.println(battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }


    public static String battle(String goodAmounts, String evilAmounts) {
        Map<String, Integer> forceEvilWorth = Map.of("Orcs", 1,
                "Men", 2, "Wargs", 2, "Goblins", 2, "Uruk Hai", 3, "Trolls", 5, "Wizards", 10);

        Map<String, Integer> forceGoodWorth = Map.of("Hobbits", 1,
                "Men", 2, "Elves", 3, "Dwarves", 3, "Eagles", 4, "Wizards", 10);
        int evilTotal = 0;
        int goodTotal = 0;

        goodAmounts = goodAmounts.replaceAll(" ", "");
        evilAmounts = evilAmounts.replaceAll(" ", "");

        char[]  goodCharArr = goodAmounts.toCharArray();
        for(int i = 0; i < goodCharArr.length - 1; i++){
            String goodKey = getGoodKey(i + 1);

            if(forceGoodWorth.containsKey(goodKey)){
                int raceWorth = forceGoodWorth.get(goodKey);
                int totalRaceWorth = Integer.parseInt(String.valueOf(goodCharArr[i])) * raceWorth;
                goodTotal+=totalRaceWorth;
            }
        }
        char[]  evilCharArr = evilAmounts.toCharArray();
        for(int i = 0; i < evilCharArr.length - 1; i++){
            String evilKey = getEvilKey(i + 1);

            if(forceEvilWorth.containsKey(evilKey)){
                int raceWorth = forceEvilWorth.get(evilKey);
                int totalRaceWorth = Integer.parseInt(String.valueOf(goodCharArr[i])) * raceWorth;
                evilTotal+=totalRaceWorth;
            }
        }

        if(goodTotal < evilTotal){
            return  "Battle Result: Evil eradicates all trace of Good";
        }else if(evilTotal < goodTotal){
            return "Battle Result: Good triumphs over Evil";
        }else{
            return "Battle Result: No victor on this battle field";
        }



}
   private  static String getEvilKey(int order) {
       return  switch (order) {
              case 1 ->  "Orcs";
              case 2 -> "Men";
              case 3 -> "Wargs";
              case 4 -> "Goblins";
              case 5 -> "Uruk Hai";
              case 6 -> "Trolls";
              case 7 -> "Wizards";
              default -> "Unknown";
          };


   }
    private  static String getGoodKey(int order) {
        return  switch (order) {
            case 1 -> "Hobbits";
            case 2 -> "Men";
            case 3 -> "Elves";
            case 4 -> "Dwarves";
            case 5 -> "Eagles";
            case 6 -> "Wizards";
            default -> "Unknown";
        };


    }

}
