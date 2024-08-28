package com.selamkd.August;

import com.selamkd.August.take10minswalk.TenMinWalk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TenMinWalkTests {
    
    @Test
    @DisplayName("Should return true given 'n','s','n','s','n','s','n','s','n','s'")
    void shouldReturnTrue() {

        char[] input = {'n','s','n','s','n','s','n','s','n','s'};
        boolean output = TenMinWalk.isValid(input);

        Assertions.assertTrue(output);
    }

    @Test
    @DisplayName("Should return false given w','e','w','e','w','e','w','e','w','e','w','e'")
    void shouldReturnFalse() {

        char[] input ={'w','e','w','e','w','e','w','e','w','e','w','e'};
        boolean output = TenMinWalk.isValid(input);

        Assertions.assertFalse(output);
    }

    @Test
    @DisplayName("Should return false given 'w'")
    void shouldReturnFalse_givenW() {

        char[] input ={'w'};
        boolean output = TenMinWalk.isValid(input);

        Assertions.assertFalse(output);
    }

    @Test
    @DisplayName("Should return false given 'n','n','n','s','n','s','n','s','n','s'")
    void shouldReturnFalse_givenNNNSNSNS() {

        char[] input = {'n','n','n','s','n','s','n','s','n','s'};
        boolean output = TenMinWalk.isValid(input);

        Assertions.assertFalse(output);
    }
}
