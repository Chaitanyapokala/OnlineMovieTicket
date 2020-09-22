package com.capg.omt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.omt.entity.Movie;
import com.capg.omt.exception.MovieNotFound;

@Repository
@Transactional
public class MovieDaoImpl implements IMovieDao{
	
	@Autowired
	IMovieRepo repository;

	@Override
	public Movie addMovie(Movie bean) {
		return repository.save(bean);
	}

	@Override
	public void deleteMovie(int movieId) {
		if (!repository.existsById(movieId)) {
			throw new MovieNotFound("Movie Not Found");
		}
		 repository.deleteById(movieId);;
	}

	@Override
	public List<Movie> listOfMovies() {
		return repository.findAll();
	}

	@Override
	public Movie viewMovie(int movieId) {
		// TODO Auto-generated method stub
		if (!repository.existsById(movieId)) {
			throw new MovieNotFound("Movie Not Found");
		}
		return repository.findById(movieId).get();
	}


	@Override
	public Movie modifyMovie(int movieId, String movieName, String movieDirector, int movieLength,
			String movieLanguage, String movieGenre) {
		// TODO Auto-generated method stub
		if (!repository.existsById(movieId)) {
			throw new MovieNotFound("Movie Not Found");
		}
		Movie movies=repository.getOne(movieId);
		movies.setMovieName(movieName);
		movies.setMovieDirector(movieDirector);
		movies.setMovieGenre(movieGenre);
		movies.setMovieLength(movieLength);
		movies.setLanguages(movieLanguage);
		
		return null;
	}

}
