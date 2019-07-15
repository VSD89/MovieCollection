package ru.vsd.dao;

import org.springframework.stereotype.Repository;
import ru.vsd.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class MovieDAOImpl implements MovieDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(1);
    private static Map<Integer, Movie> movies = new HashMap<>();

    static {
        Movie movie1 = new Movie();
        movie1.setId(AUTO_ID.getAndIncrement());
        movie1.setTitle("Point Break");
        movie1.setYear(1991);
        movie1.setGenre("action");
        movie1.setWatched(true);
        movies.put(movie1.getId(), movie1);

        Movie movie2 = new Movie();
        movie2.setId(AUTO_ID.getAndIncrement());
        movie2.setTitle("The Departed");
        movie2.setYear(2006);
        movie2.setGenre("thriller");
        movie2.setWatched(true);
        movies.put(movie2.getId(), movie2);

        Movie movie3 = new Movie();
        movie3.setId(AUTO_ID.getAndIncrement());
        movie3.setTitle("Interstate 60");
        movie3.setYear(2002);
        movie3.setGenre("fantasy");
        movie3.setWatched(true);
        movies.put(movie3.getId(), movie3);
    }

    @Override
    public List<Movie> allMovies() {
        return new ArrayList<>(movies.values());
    }

    @Override
    public void add(Movie movie) {
        movie.setId(AUTO_ID.getAndIncrement());
        movies.put(movie.getId(), movie);
    }

    @Override
    public void delete(Movie movie) {
        movies.remove(movie.getId());
    }

    @Override
    public void edit(Movie movie) {
        movies.put(movie.getId(), movie);
    }

    @Override
    public Movie getById(int id) {
        return movies.get(id);
    }
}
