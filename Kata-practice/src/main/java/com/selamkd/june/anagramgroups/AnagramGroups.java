package com.selamkd.june.anagramgroups;

import java.util.*;

public class AnagramGroups {


    public static List<List<String>> groupAnagrams (String[] strArr){
        List<List<String>> groupedAnagrams;

        HashMap<String, List<String>> groupAnagrams = new HashMap<>();

        for(String str: strArr){

          char[]  charArr = str.toCharArray();
          Arrays.sort(charArr);
          String sortedString = new String(charArr);
            if(!groupAnagrams.containsKey(sortedString)){
                groupAnagrams.put(sortedString, new ArrayList<>());
            }

            groupAnagrams.get(sortedString).add(str);

        }
       groupedAnagrams = new ArrayList<>(groupAnagrams.values());
        groupedAnagrams.sort(Comparator.comparingInt(List::size));
        return groupedAnagrams;
    }

}
