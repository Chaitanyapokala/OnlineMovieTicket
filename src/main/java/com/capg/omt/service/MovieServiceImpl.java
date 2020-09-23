package com.capg.omt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capg.omt.entity.Movie;
import com.capg.omt.exception.MovieNotFound;
import com.capg.omt.repository.IMovieRepo;

@Service
@Repository
@Transactional
public class MovieServiceImpl implements IMovieService {

	@Autowired
	IMovieRepo repository;

	@Override
	public Movie addMovie(Movie bean) {
	
		return repository.save(bean);
		}

		@Override
		public void deleteMovie(int movieId) throws MovieNotFound {
			if (!repository.existsById(movieId)) {
				throw new MovieNotFound("Movie Not Found");
			}
			repository.deleteById(movieId);
			;
		}

		@Override
		public List<Movie> listOfMovies() {
			return repository.findAll();
		}

		@Override
		public Movie viewMovie(int movieId) throws MovieNotFound {
			// TODO Auto-generated method stub
			if (!repository.existsById(movieId)) {
				throw new MovieNotFound("Movie Not Found");
			}
			return repository.findById(movieId).get();
		}

		@Override
		public Movie modifyMovie(int movieId, String movieName, String movieDirector, int movieLength, String movieLanguage,
				String movieGenre) throws MovieNotFound {
			// TODO Auto-generated method stub
			if (!repository.existsById(movieId)) {
				throw new MovieNotFound("Movie Not Found");
			}
			Movie movies = repository.getOne(movieId);
			movies.setMovieName(movieName);
			movies.setMovieDirector(movieDirector);
			movies.setMovieGenre(movieGenre);
			movies.setMovieLength(movieLength);
			movies.setLanguages(movieLanguage);

			return null;
		}


}
