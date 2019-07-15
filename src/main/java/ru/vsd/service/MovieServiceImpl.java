package ru.vsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vsd.dao.MovieDAO;
import ru.vsd.dao.MovieDAOImpl;
import ru.vsd.model.Movie;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieDAO movieDAO = new MovieDAOImpl();

    @Autowired
    public void setMovieDAO(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @Override
    public List<Movie> allMovies() {
        return movieDAO.allMovies();
    }

    @Override
    public void add(Movie movie) {
        movieDAO.add(movie);
    }

    @Override
    public void delete(Movie movie) {
        movieDAO.delete(movie);
    }

    @Override
    public void edit(Movie movie) {
        movieDAO.edit(movie);
    }

    @Override
    public Movie getById(int id) {
        return movieDAO.getById(id);
    }
}
