package com.capg.omt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.omt.entity.Movie;
import com.capg.omt.service.IMovieService;

@SpringBootTest
class MovieTest {

	@Autowired
	IMovieService service;
	
	@Test
	void contextLoads() {
		Movie movies = new Movie();
		movies.setMovieId(2);
		
	}

}
