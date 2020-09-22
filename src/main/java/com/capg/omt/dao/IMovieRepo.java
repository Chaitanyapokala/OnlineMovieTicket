package com.capg.omt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.omt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

}
