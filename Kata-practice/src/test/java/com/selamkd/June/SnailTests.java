package com.selamkd.June;

import com.selamkd.July.snail.Snail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SnailTests {


    @Test
    @DisplayName("Given a 2D array should elements from outermost to middle")
    void givenA2DArrayShouldElementsFromOutermostToMiddle() {
      int[][] TDArrayInput = {{1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}};
      int[] expectedOutput = {1, 2, 3, 6, 9, 8, 7, 4, 5};
      int[] actualOutput = Snail.snail(TDArrayInput);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}
