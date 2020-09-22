package com.capg.omt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omt.dao.MovieDaoImpl;
import com.capg.omt.entity.Movie;

@RestController
@RequestMapping("/Movie")
public class MovieController {

	@Autowired
	MovieDaoImpl service;

	@PostMapping("/add")
	public Movie addMovie(@RequestBody Movie bean) {
		Movie movie = service.addMovie(bean);
		return movie;
	}

	@GetMapping("/viewbyid/{movieId}")
	public Movie viewMovie(@PathVariable int movieId) {
		Movie movie = service.viewMovie(movieId);
		return movie;
	}

	@GetMapping("/viewall")
	public List<Movie> listOfMovies() {
		List<Movie> movie = service.listOfMovies();

		return movie;
	}

	@DeleteMapping("/delete/{movieId}")
	public void deleteMovie(@PathVariable int movieId) {
		service.deleteMovie(movieId);
		System.out.println("Message Deleted");
	}
	
	@PostMapping("/modify")
	public Movie modifyMovie(@RequestBody Movie movie)
	{
		Movie movies=service.modifyMovie(movie.getMovieId(),movie.getMovieName(),movie.getMovieDirector(),movie.getMovieLength(),movie.getLanguages(),movie.getMovieGenre());
		return movies;
		
	}

}
