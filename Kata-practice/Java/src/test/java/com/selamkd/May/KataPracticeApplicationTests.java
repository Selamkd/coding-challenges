package com.selamkd.May;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class KataPracticeApplicationTests {


  @Test
  @DisplayName("Given num 4 it should return 6")
  void givenNum4ItShouldReturn6() {
    int givenNum = 4;
    int expected = 6;
    int actual = PossiblePairs.findPossiblePairs(givenNum);
    Assertions.assertEquals(expected, actual);
      
  }
  @Test
  @DisplayName("Given num 5 it should return 10")
  void givenNum5ItShouldReturn10() {
    int givenNum = 5;
    int expected = 10;
    int actual = PossiblePairs.findPossiblePairs(givenNum);
    Assertions.assertEquals(expected, actual);

  }
  @Test
  void testClosestToZero() {
    int[] nums1 = {3, -7, 2, 8, -5};
    Assertions.assertEquals(2, ClosestToZero.closestToZero(nums1));
    int[] nums2 = {3, -3, 5, -5};
    Assertions.assertEquals(3, ClosestToZero.closestToZero(nums2));

    int[] nums3 = {2, 6, 1, 8, 4};
    Assertions.assertEquals(1, ClosestToZero.closestToZero(nums3));

    int[] nums4 = {-5, -7, -1, -3, -8};
    Assertions.assertEquals(-1, ClosestToZero.closestToZero(nums4));


  }
  

}
