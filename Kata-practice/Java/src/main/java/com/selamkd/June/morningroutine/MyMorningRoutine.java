package com.selamkd.June.morningroutine;

import java.time.LocalDateTime;

public class MyMorningRoutine  {
    public static String  whatShouldIDoNow(LocalDateTime now){

        int hour = now.getHour();
        int minute = now.getMinute();
        int currentTime = hour * 100 + minute;
         String result = " ";

        if(currentTime >= 600 && currentTime <= 659 ){
            result = "Do exercise";
        }else if(currentTime >= 700 && currentTime <= 759 ){
            result = "Read and study";
        }else if(currentTime >= 800 && currentTime <= 859 ){
            result = "Have breakfast";
        }else{
            result = "No activity";
        }
     return result;
    }
}
