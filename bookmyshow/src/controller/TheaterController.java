package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import enums.City;
import model.Movie;
import model.Show;
import model.Theater;

public class TheaterController {
    private Map<City, List<Theater>> cityVsTheater;
    private List<Theater> allTheaters;

    // public Map<Date, List<Movie>> getMovies(List<Date> dateList);
	// public Map<Date, List<Show>> getShows(List<Date> dateList);

    Map<Theater, List<Show>> getAllShow(Movie movie, City city) {

        Map<Theater, List<Show>> theaterVsShows = new HashMap<>();
        List<Theater> theaters = cityVsTheater.get(city);

        for (Theater theater : theaters) {

            List<Show> givenMovieShows = new ArrayList<>();
            // List<Show> shows = theater.getAudi().getShows();

            // for (Show show : shows) {
            //     if (show.movie.getMovieId() == movie.getMovieId()) {
            //         givenMovieShows.add(show);
            //     }
            // }
            // if (!givenMovieShows.isEmpty()) {
            //     theaterVsShows.put(theater, givenMovieShows);
            // }
        }

        return theaterVsShows;
    }
}
