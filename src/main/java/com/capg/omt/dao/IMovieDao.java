package com.capg.omt.dao;

import java.util.List;

import com.capg.omt.entity.Movie;

public interface IMovieDao {
	public Movie addMovie(Movie bean);

	public void deleteMovie(int movieId);

	public List<Movie> listOfMovies();

	public Movie viewMovie(int movieId);

	public Movie modifyMovie(int movieId,String movieName,String movieDirector,int movieLengthInMinutes,String movieLanguage,String movieGenre);
}
