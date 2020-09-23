package com.capg.omt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omt.entity.Movie;
import com.capg.omt.exception.MovieNotFound;
import com.capg.omt.service.MovieServiceImpl;

@RestController
@RequestMapping("/Movie")
public class MovieController {

	@Autowired
	MovieServiceImpl service;

	@PostMapping("/add")
	public Movie addMovie(@RequestBody Movie bean) {
		Movie movie = service.addMovie(bean);
		return movie;
	}

	@GetMapping("/viewbyid/{movieId}")
	public Movie viewMovie(@PathVariable int movieId, HttpServletRequest request) throws MovieNotFound {
		Movie movie = service.viewMovie(movieId);
		return movie;
	}

	@GetMapping("/viewall")
	public List<Movie> listOfMovies(HttpServletRequest request) throws MovieNotFound {
		List<Movie> movie = service.listOfMovies();

		return movie;
	}

	@DeleteMapping("/delete/{movieId}")
	public void deleteMovie(@PathVariable int movieId, HttpServletRequest request) throws MovieNotFound {
		service.deleteMovie(movieId);
		System.out.println("Message Deleted");
	}

	@PostMapping("/modify")
	public Movie modifyMovie(@RequestBody Movie movie, HttpServletRequest request) throws MovieNotFound {
		Movie movies = service.modifyMovie(movie.getMovieId(), movie.getMovieName(), movie.getMovieDirector(),
				movie.getMovieLength(), movie.getLanguages(), movie.getMovieGenre());
		return movies;

	}

}
