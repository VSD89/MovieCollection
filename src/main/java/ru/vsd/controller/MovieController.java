package ru.vsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.vsd.model.Movie;

@Controller
public class MovieController {
    private static Movie movie;

    static {
        movie = new Movie();
        movie.setTitle("Point Break");
        movie.setYear(1991);
        movie.setGenre("action");
        movie.setWatched(true);
    }

    @GetMapping(value = "/")
    public ModelAndView allMovies() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("movies");
        modelAndView.addObject("movie", movie);
        return modelAndView;
    }

    @GetMapping(value = "/edit")
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}
