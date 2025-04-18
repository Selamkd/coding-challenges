package com.selamkd.August.theoffice;

public class Room {
    String occupants;
    Integer chairs;

    public Room(String occupants, Integer chairs) {
        this.occupants = occupants;
        this.chairs = chairs;
    }

    @Override
    public String toString() {
        return "Room{" +
                "occupants='" + occupants + '\'' +
                ", chairs=" + chairs +
                '}';
    }
}
