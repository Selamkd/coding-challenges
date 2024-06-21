package com.selamkd.june;

import com.selamkd.june.morningroutine.MyMorningRoutine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class MyMorningRoutineTests {


    @Test
    @DisplayName("Given time 06:00 should return Do exercise")
    void givenTime0600ShouldReturnDoExercise() {
        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 6, 0);
        String expected = "Do exercise";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Given time 06:30 should return Do exercise")
    void givenTime0630() {
        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 6, 30);
        String expected = "Do exercise";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);


    }


    @Test
    @DisplayName("Given time 06:59 should return: Do exercise ")
    void givenTime0659ShouldReturnDoExercise() {
        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 6, 59);
        String expected = "Do exercise";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);


    }


    @Test
    @DisplayName("Given time 07:00 should return: Read and study")
    void givenTime0700ShouldReturnReadAndStudy() {

        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 7, 0);
        String expected = "Read and study";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Given time 07:40 should return: Read and study")
    void givenTime0740ShouldReturnReadAndStudy() {

        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 7, 40);
        String expected = "Read and study";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Given time 07:40 should return: Read and study")
    void givenTime0759ShouldReturnReadAndStudy() {

        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 7, 59);
        String expected = "Read and study";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Given time 08:00 should return: Have breakfast")
    void givenTime800ShouldReturnHaveBreakfast() {

        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 8, 0);
        String expected = "Have breakfast";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Given time 08:20 should return: Have breakfast")
    void givenTime820ShouldReturnHaveBreakfast() {

        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 8, 20);
        String expected = "Have breakfast";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Given time 08:59 should return: Have breakfast")
    void givenTime859ShouldReturnHaveBreakfast() {

        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 8, 59);
        String expected = "Have breakfast";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);

    }


    @Test
    @DisplayName("Given time 9:00 should return: No activity")
    void givenTime900ShouldReturnWork() {
        LocalDateTime testTime = LocalDateTime.of(2024, 6, 21, 9, 0);
        String expected = "No activity";
        String actual = MyMorningRoutine.whatShouldIDoNow(testTime);
        Assertions.assertEquals(expected, actual);


    }


}
