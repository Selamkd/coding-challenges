package com.selamkd.July.HexToRGB;

import java.util.HashMap;

public class HexToRGB {
    public static void main(String[] args) {
        System.out.println(hexStringToRGB("#111111"));
    }
    public static HashMap<String, Integer> hexStringToRGB(String hex) {

        // hex -> {r, g, b}
        HashMap<String, Integer> rgbMap = new HashMap<>();

        String R = hex.substring(1, 3);
        rgbMap.put("r", Integer.parseInt(R, 16));
        String G = hex.substring(3, 5);
        rgbMap.put("g", Integer.parseInt(G, 16));
        String B = hex.substring(5, 7);
        rgbMap.put("b", Integer.parseInt(B, 16));

        return rgbMap;
    }
}
