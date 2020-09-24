package com.capg.omt.service;

import java.util.List;

import com.capg.omt.entity.Movie;

public interface IMovieService {

	public Movie addMovie(Movie bean) ;

	public void deleteMovie(int movieId);

	public Movie viewMovie(int movieId);

	public List<Movie> listOfMovies();

	public Movie modifyMovie(int movieId,String movieName,String movieDirector,int movieLengthInMinutes,String movieLanguage,String movieGenre);
}
