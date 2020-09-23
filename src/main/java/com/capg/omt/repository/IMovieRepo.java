package com.capg.omt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.omt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

}
