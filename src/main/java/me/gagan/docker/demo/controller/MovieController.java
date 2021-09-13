package me.gagan.docker.demo.controller;

import me.gagan.docker.demo.model.Movie;
import me.gagan.docker.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/movies")
    public void addMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
    }

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }
}
