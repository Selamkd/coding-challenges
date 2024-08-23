package com.selamkd.August.goodvsevil;

import java.sql.SQLOutput;
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

        goodAmounts = evilAmounts.replaceAll(" ", "");
        char[] evilChar = evilAmounts.toCharArray();
        evilAmounts = evilAmounts.replaceAll(" ", "");
        char[] goodChar = goodAmounts.toCharArray();
        for (int i = 0; i < evilChar.length; i++) {

            String evilKey = getEvilKey(i + 1);
            int evilCount = evilChar[i] - '0';
            if (evilChar[i] != '0') {
                int evilWorth = forceEvilWorth.get(evilKey);


                int evilForce = evilCount * evilWorth;
                evilTotal += evilForce;
            }

        }
        for (int j = 0; j < goodChar.length; j++) {

            String goodKey = getGoodKey(j + 1);
            int goodCount = goodChar[j] - '0';
            if(goodChar[j]  != '0') {
                int goodWorth = forceGoodWorth.get(goodKey);
                int goodForce = goodCount * goodWorth;
                goodTotal+=goodForce;
            }




        }

        return"";

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
