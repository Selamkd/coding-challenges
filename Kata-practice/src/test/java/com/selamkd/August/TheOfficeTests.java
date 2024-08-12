package com.selamkd.August;

import com.selamkd.August.theoffice.Room;
import com.selamkd.August.theoffice.TheOffice_FindaChair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TheOfficeTests {


    @Test
    @DisplayName("Given input provided should return an int array containing nums 3,6,9")
    void shouldReturnAnIntArray() {
        Room[] inputRooms = new Room[]{
                new Room("XXX", 3),
                new Room("XXXXX", 6),
                new Room("XXXXXX", 9)
        };

       Object actualOutput = TheOffice_FindaChair.meeting(inputRooms,4);
       int[] expectedOutput = new int[] {0,1,3};
       if(actualOutput instanceof int[]){
           int[] actualArray = (int[]) actualOutput;
           Assertions.assertArrayEquals(expectedOutput,actualArray);
       }
        Assertions.fail("Got a different type returned " + actualOutput);



    }

    @Test
    @DisplayName("Given input provided should return an int array containing nums 0,0,1,2,2")
    void shouldReturnAnIntArray_length5() {
        Room[] inputRooms = new Room[]{
                new Room("XXX", 1),
                new Room("XXXXXX", 6),
                new Room("X", 2),
                new Room("XXXXXX", 8),
                new Room("X", 3),
                new Room("XXX", 1)
        };

        Object actualOutput = TheOffice_FindaChair.meeting(inputRooms,5);
        int[] expectedOutput = new int[] {0,0,1,2,2};
        if(actualOutput instanceof int[] actualArray){
            Assertions.assertArrayEquals(expectedOutput,actualArray);
        }
        Assertions.fail("Got a different type returned " + actualOutput);



    }
}
