package model;

import java.util.List;

public class Audi {

    private int audiId;
    private String audiName;
    private Theater theater; // in order to backtrack show -> audi -> theater
    private List<Seat> seats;
    private List<Show> shows;

    public List<Show> getShows() {
        return shows;
    }

    public Theater getTheater() {
        return theater;
    }
}
