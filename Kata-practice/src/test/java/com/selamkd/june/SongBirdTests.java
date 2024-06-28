package com.selamkd.june;

import com.selamkd.june.songbird.Bird;
import com.selamkd.june.songbird.Branch;
import com.selamkd.june.songbird.SongBird;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class SongBirdTests {

    @Test
    @DisplayName("Check that it returns 0 when there are no birds")

    public void checkItReturns0whenGiven0Birds(){
        int expectedOutput = SongBird.getSongBirdCount( new Bird[] {});
        Assertions.assertEquals(0, expectedOutput);

    }


    @Test
    @DisplayName("Check that it returns 1 when there is a single bird ")
    void checkThatItReturns1WhenThereIsASingleBird() {
        Bird[] birds = {Bird.BIRD_A};
        int expectedOutput = SongBird.getSongBirdCount( birds);

        Assertions.assertEquals(1, expectedOutput);
    }

}
