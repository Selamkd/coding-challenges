package com.selamkd.July.TimeFormatter;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        StringBuilder result  = new StringBuilder();
        if(seconds > 60) {
            int minutes = seconds / 60;
            result.append(minutes).append(" minutes ");
        }
        if(seconds > 3600 ){
            int hours = seconds / 3600;
            result.append(hours).append(" hours ");
        }
      if(seconds > 86400){
          int days = seconds/ 86400;
          result.append(days).append(" days ");
      }
      if(seconds > 3.1556952){
          int years = (int) (seconds/3.1556952);
          result.append(years).append(" year");
      }


      result.append(seconds).append(" seconds.");


        return result.toString();
    }
}
