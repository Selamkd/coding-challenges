package com.selamkd.may;

public class PossiblePairs {


    public static int findPossiblePairs(int num){
          if(num <= 1){
              throw new IllegalArgumentException();
          }
            int remaining = num - 1;
            int totalPairs = num * remaining;


            return totalPairs / 2 ;

    }
}
