package models;

import enums.Direction;

public class Display {
    
    private int currentFloor;
    private Direction direction;

    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public String toString() {
        return "Current floor: " + currentFloor + ", Direction: " + direction.name(); 
    }
}
