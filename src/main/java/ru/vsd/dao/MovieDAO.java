package ru.vsd.dao;

import ru.vsd.model.Movie;

import java.util.List;

public interface MovieDAO {
    List<Movie> allMovies();
    void add(Movie movie);
    void delete(Movie movie);
    void edit(Movie movie);
    Movie getById(int id);
}
