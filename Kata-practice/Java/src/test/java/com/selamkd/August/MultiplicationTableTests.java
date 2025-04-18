package com.selamkd.August;

import com.selamkd.August.multiplicationtable.MultiplicationTable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MultiplicationTableTests {


    @Test
    @DisplayName("Given input 3 should return")
    void givenInput3ShouldReturn() {

        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test, MultiplicationTable.multiplicationTable(3));

    }

    @Test
    @DisplayName("Given input 1 should return")
    void givenInput1ShouldReturn() {

        int[][] test = {{1}};
        assertArrayEquals(test, MultiplicationTable.multiplicationTable(3));

    }
}
