package com.selamkd.July.digitalroot;

public class DigitalRoot {
    public static int digital_root(int n) {
        while(n >= 10){
            int sum = 0;
            String numStr = String.valueOf(n);

            for(int i =0; i < numStr.length();i++){
                int num = Integer.parseInt(String.valueOf(numStr.charAt(i)));
                sum+=num;
            }
            n = sum;
        }
        return n;
    }
}
