package com.selamkd.August.take10minswalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        if(walk.length == 10) return true;
        int n =0;
        int s = 0;
        int e = 0;
        int w = 0;

        for(char ch : walk){
            switch(ch){
                case 'n':
                    n+=1;
                case 's':
                    s+=1;
                case 'w':
                    w+=1;
                case 'e':
                    e+=1;

            }
        }


        return (n == 0 && s == 0 && e == 0 && w == 0 );
    }
}
