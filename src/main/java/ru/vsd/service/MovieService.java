package ru.vsd.service;

import ru.vsd.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> allMovies();
    void add(Movie movie);
    void delete(Movie movie);
    void edit(Movie movie);
    Movie getById(int id);
}
