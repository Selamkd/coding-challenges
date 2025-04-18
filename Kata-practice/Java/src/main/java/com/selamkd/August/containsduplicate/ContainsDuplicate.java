package com.selamkd.August.containsduplicate;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums){
        HashSet<Integer> numsSet = new HashSet<>();

          for(int num : nums){
              if(!numsSet.add(num)){
                  return true;
              }
          }
          return false;
    }
}
