package ru.vsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.vsd.model.Movie;
import ru.vsd.service.MovieService;

import java.util.List;

@Controller
public class MovieController {
    private MovieService movieService;

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/")
    public ModelAndView allMovies() {
        List<Movie> movies = movieService.allMovies();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("movies");
        modelAndView.addObject("moviesList", movies);
        return modelAndView;
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editPage(@PathVariable("id") int id) {
        Movie movie = movieService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("movie", movie);
        return modelAndView;
    }

    @PostMapping(value = "/edit")
    public ModelAndView editMovie(@ModelAttribute("movie") Movie movie) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        movieService.edit(movie);
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public ModelAndView addMovie(@ModelAttribute("movie") Movie movie) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        movieService.add(movie);
        return modelAndView;
    }

    @GetMapping(value="/delete/{id}")
    public ModelAndView deleteMovie(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Movie movie = movieService.getById(id);
        movieService.delete(movie);
        return modelAndView;
    }
}
