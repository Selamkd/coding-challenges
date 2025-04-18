package com.selamkd.August.take10minswalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        int ns =0;
        int ew = 0;

        for(char ch : walk){
            switch(ch){
                case 'n':
                    ns+=1;
                    break;
                case 's':
                    ns-=1;
                    break;
                case 'w':
                    ew-=1;
                    break;
                case 'e':
                    ew+=1;
                    break;

            }
        }
        return ns == 0 && ew == 0 && walk.length == 10;
    }
}
