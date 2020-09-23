package com.capg.omt;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.omt.entity.Movie;
import com.capg.omt.service.IMovieService;

@RunWith(SpringRunner.class)
@SpringBootTest
class MovieTest {

	@Mock
	private IMovieService service;
	
	
	@Test
	public void testgetAllMovies() {
		Movie movies = new Movie();
		movies.setMovieId(24);
		movies.setMovieName("V Movie");
		movies.setMovieDirector("AVN");
		movies.setMovieLength(180);
		movies.setLanguages("Telugu");
		movies.setMovieGenre("Thriller");
		
		Movie movies1 = new Movie();
		movies1.setMovieId(25);
		movies1.setMovieName("Avengers");
		movies1.setMovieDirector("Marvel");
		movies1.setMovieLength(159);
		movies1.setLanguages("English");
		movies1.setMovieGenre("Drama");
		
		List<Movie> movielist = new ArrayList<>();
		movielist.add(movies);
		movielist.add(movies1);
		
		Mockito.when(service.listOfMovies()).thenReturn(movielist);
		assertThat(service.listOfMovies()).isEqualTo(movielist);
		assertEquals(movielist.size(),2);
		
		
	}

	@Test
	public void testAddMovie() {
		Movie movies = new Movie();
		movies.setMovieId(26);
		movies.setMovieName("Chhichhore");
		movies.setMovieDirector("Nitesh");
		movies.setMovieLength(150);
		movies.setLanguages("Hindi");
		movies.setMovieGenre("Comedy");
		Mockito.when(service.addMovie(movies)).thenReturn(movies);
		assertThat(service.addMovie(movies)).isEqualTo(movies);

	}
}
