package com.selamkd.July.bitcounting;

public class BitCounting {

    public static int countBits(int n) {
        int count = 0;
        String intBinaryString = Integer.toBinaryString(n);

        for (char ch : intBinaryString.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }

}
