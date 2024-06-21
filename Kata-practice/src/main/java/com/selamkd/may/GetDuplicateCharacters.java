package com.selamkd.may;
import java.util.HashSet;
import java.util.Set;
public class GetDuplicateCharacters {
  public static char[] getDuplicateCharacters(String str) {
    // check if string length is greater than 2
    if (str.length() < 2) {
      return null;
    }
    // hash set to store characters already seen and duplicates
    Set<Character> seen = new HashSet<>();
    Set<Character> duplicates = new HashSet<>();
    // loop through str array
    for (char ch : str.toCharArray()) {
      // if adding to seen isn't possible it means that it's duplicate
      if (!seen.add(ch)) {
        // add to duplicates set
        duplicates.add(ch);
      }
    }
    // initialise result array with the same length as duplicates
    char[] result = new char[duplicates.size()];
    // i to iterates as the index for result array
    int i = 0;
    // loop through duplicates
    for (char ch : duplicates) {
      // set the result i index to be character
      result[i++] = ch;
    }
    return result;
  }

  }