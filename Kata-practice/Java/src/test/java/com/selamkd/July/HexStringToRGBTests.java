package com.selamkd.July;

import com.selamkd.July.HexToRGB.HexToRGB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HexStringToRGBTests {


    @Test
    @DisplayName("Hex - #111111 should return -> {r:17, g:17, b:17")
    void hex111111ShouldReturnR17G17B17() {
        HashMap<String, Integer> rgbMap = new HashMap<String, Integer>();
         rgbMap.put("r", 17);
         rgbMap.put("g", 17);
         rgbMap.put("b", 17);
         HashMap <String, Integer> actualOutput = HexToRGB.hexStringToRGB("#111111");

        Assertions.assertEquals(rgbMap, actualOutput);
    }

    @Test
    @DisplayName("Hex - #000000 should return ->  {r: 0, g: 0, b: 0}")
    void hex000000ShouldReturnR0G0B0() {
        HashMap<String, Integer> rgbMap = new HashMap<String, Integer>();
        rgbMap.put("r", 0);
        rgbMap.put("g", 0);
        rgbMap.put("b", 0);
        HashMap <String, Integer> actualOutput = HexToRGB.hexStringToRGB("#000000");

        Assertions.assertEquals(rgbMap, actualOutput);
    }
    @Test
    @DisplayName("Hex - #FF9933 should return -> {r: 255, g: 153, b: 51}")
    void hexFF9933ShouldReturnR255G153B51() {
        HashMap<String, Integer> rgbMap = new HashMap<>();
        rgbMap.put("r", 255);
        rgbMap.put("g", 153);
        rgbMap.put("b", 51);
        HashMap <String, Integer> actualOutput = HexToRGB.hexStringToRGB("#FF9933");

        Assertions.assertEquals(rgbMap, actualOutput);
    }
    @Test
    @DisplayName("Hex - #beaded should return -> {r: 190, g: 173, b: 237}")
    void hexbeadedShouldReturnR190G173B237() {
        HashMap<String, Integer> rgbMap = new HashMap<>();
        rgbMap.put("r", 190);
        rgbMap.put("g", 173);
        rgbMap.put("b", 237);
        HashMap <String, Integer> actualOutput = HexToRGB.hexStringToRGB("#beaded");

        Assertions.assertEquals(rgbMap, actualOutput);
    }
    @Test
    @DisplayName("Hex - #Fa3456 should return -> {r: 250, g: 52, b: 86}")
    void hexFa3456ShouldReturnR250G52B86() {
        HashMap<String, Integer> rgbMap = new HashMap<>();
        rgbMap.put("r", 250);
        rgbMap.put("g", 52);
        rgbMap.put("b", 86);
        HashMap <String, Integer> actualOutput = HexToRGB.hexStringToRGB("#Fa3456");

        Assertions.assertEquals(rgbMap, actualOutput);
    }
}
