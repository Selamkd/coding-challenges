package com.selamkd.june;

import com.selamkd.june.searchinsert.SearchInsertPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTests {



    @Test
    @DisplayName("Given nums [1,3,5,6] and target is 5, should return 2")
    void givenNums1356AndTargetIs5ShouldReturn2() {

         int target = 5;
         int[] nums = {1,3,5,6};
         int output = SearchInsertPosition.searchInsert(nums, target);

        Assertions.assertEquals(2, output);

    }

    @Test
    @DisplayName("Given nums [1,3,5,6] and target is 2, should return 1")
    void givenNums1356AndTargetIs5ShouldReturn1() {

        int target = 2;
        int[] nums = {1,3,5,6};
        int output = SearchInsertPosition.searchInsert(nums, target);

        Assertions.assertEquals(1, output);

    }

    @Test
    @DisplayName("Given nums [1,3,5,6] and target is 7, should return 4")
    void givenNums1356AndTargetIs5ShouldReturn4() {

        int target = 7;
        int[] nums = {1,3,5,6};
        int output = SearchInsertPosition.searchInsert(nums, target);

        Assertions.assertEquals(4, output);

    }
}
