package com.selamkd.July.SimpleCalculator;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println(add("1,2"));
    }

    public static int add(String numbers){
        int sum = 0;
      if(numbers.isEmpty()) return 0;
      if(numbers.length() == 1) return Integer.parseInt(numbers);

      for(char num : numbers.toCharArray()){
          if(Character.isDigit(num)){
              sum+=Integer.parseInt(String.valueOf(num));
          }
      }
      return sum;
    }
}
