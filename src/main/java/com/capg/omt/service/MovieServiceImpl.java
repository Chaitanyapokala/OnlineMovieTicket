package com.capg.omt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omt.entity.Movie;
import com.capg.omt.dao.IMovieDao;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	IMovieDao dao;

	@Override
	public Movie addMovie(Movie bean) {
		// TODO Auto-generated method stub
		return dao.addMovie(bean);
	}

	@Override
	public void deleteMovie(int movieId) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Movie> listOfMovies() {
		// TODO Auto-generated method stub
		return dao.listOfMovies();
	}

	@Override
	public Movie viewMovie(int movieId) {
		// TODO Auto-generated method stub
		return dao.viewMovie(movieId);
	}

	@Override
	public Movie modifyMovie(int movieId, String movieName, String movieDirector, int movieLengthInMinutes,
			String movieLanguage, String movieGenre) {
		// TODO Auto-generated method stub
		return dao.modifyMovie(movieId, movieName, movieDirector, movieLengthInMinutes, movieLanguage, movieGenre);
	}


}
