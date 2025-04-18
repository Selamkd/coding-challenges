package com.selamkd.August.theoffice;

import java.util.ArrayList;
import java.util.Arrays;

public class TheOffice_FindaChair {

    public static void main(String[] args) {
        Room[] rooms = new Room[]{
                new Room("XXX", 1),
                new Room("XXXXXX", 6),
                new Room("X", 2),
                new Room("XXXXXX", 8),
                new Room("X", 3),
                new Room("XXX", 1)
        };
        Object result = meeting(rooms, 5);

        if (result instanceof String) {
            System.out.println((String) result);
        } else if (result instanceof int[]) {
            System.out.println(Arrays.toString((int[]) result));
        }

    }
    public static Object meeting(Room[] x, int need) {
        ArrayList<Integer> result = new ArrayList<>();
        int chairsCollected = 0;
        if (need == 0) {
            return "Game On";
        }
        for (Room room : x) {
            int occupants = room.occupants.length();
            int chairs = room.chairs;

            if(chairsCollected == need){
                break;
            }

            if(occupants >= chairs){
                result.add(0);
            }

            if(occupants < chairs){
                int chairsTotake = chairs - occupants;
                result.add(chairsTotake);
                chairsCollected+=chairsTotake;
            }

        }

        if(chairsCollected < need){
            return "Not enough!";
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
    }

