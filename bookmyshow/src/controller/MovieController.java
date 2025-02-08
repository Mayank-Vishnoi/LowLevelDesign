package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import enums.City;
import model.Movie;

public class MovieController {

    private Map<City, List<Movie>> cityVsMovies; // need to show this to user (hide theater details)
    private List<Movie> allMovies;

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);

        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }

    public List<Movie> getMovieByCity(City city) {
        return cityVsMovies.get(city);
    }

    // REMOVE movie from a city
    // UPDATE a movie details
}
