package com.selamkd.July.TimeFormatter;

public class TimeFormatter {
    public static void main(String[] args) {

        System.out.println(formatDuration(8110951));
    }
    public static String formatDuration(int seconds) {

        if(seconds < 60){
            return seconds + " second";
        }
        if(seconds == 3600){
            return "1 hour";
        }
        StringBuilder result  = new StringBuilder();

        if(seconds > 31622400  ){
            int years = (int) (seconds/ 31622400 );
            seconds = seconds -  31622400 ;
            result.append(years).append( years == 1 ?  "year," : " years ");
        }

        if(seconds > 86400){
            int days = seconds/ 86400;
            seconds = seconds - 86400;
            result.append(days).append( days == 1 ? " day, " : " days, ");
        }

        if(seconds >= 3600 ){
            int hours = seconds / 3600;
            seconds = seconds - 3600;
            result.append(hours).append( hours == 1 ? " hour, " : "hours, ");
        }

        if(seconds > 60) {
            int minutes = seconds / 60;
            seconds = seconds - minutes * 60;
            result.append(minutes).append( minutes == 1 ? " minute " : " minutes");
        }






          if(seconds >= 1) {
              result.append("and ");
              result.append(seconds).append(" seconds");

          }
        return result.toString();
    }
}
