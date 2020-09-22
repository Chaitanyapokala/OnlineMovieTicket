package com.capg.omt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Movies")
public class Movie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "movieId")
	private int movieId;
	
	@Column(name = "movieName")
	
	//@NotEmpty(message = "Movie Name is Mandatory")
	//@NotBlank(message = "Movie Name cannot be blank")
	@Size(min = 2, message = "Name should have atleast 2 characters")
	@Pattern(regexp = "^[A-Z a-z]*$")
	
	private String movieName;
	
	@Column(name = "movieDirector")
	
	@NotEmpty(message= "Movie Director Name is Mandatory")
	@NotBlank(message= "Movie Director Cannot be Blank")
	@Size(min= 3, message= "Director Name should have atleast 3 characters")
	@Pattern(regexp = "^[A-Z a-z]*$")
	
	private String movieDirector;
	
	@Column(name = "movieLengthInMinutes")
	
	@NotNull(message = "Movie length can not be null")
	@Min(value = 90, message = "Movie Length can not be less than 90 min")
	@Max(value = 180, message = "Movie Length can not be more than 180 min")
	
	private int movieLengthInMinutes;
	
	@Column(name = "movieLanguage")
	
	@NotEmpty(message = "Movie Language is Mandatory")
	@NotBlank(message = "Movie Language cannot be blank")
	@Size(min = 4, message = "Language should have atleast 4 characters")
	@Pattern(regexp = "^[A-Z a-z]*$")
	
	private String movieLanguage;
	
	@Column(name = "movieGenre")
	
	@NotEmpty(message = "Movie Genre is Mandatory")
	@NotBlank(message = "Movie Genre cannot be blank")
	@Size(min = 4, message = "Gnere should have atleast 4 characters")
	@Pattern(regexp = "^[A-Z a-z]*$")
	
	private String movieGenre;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLengthInMinutes;
	}

	public void setMovieLength(int movieLength) {
		this.movieLengthInMinutes = movieLength;
	}

	public String getLanguages() {
		return movieLanguage;
	}

	public void setLanguages(String languages) {
		this.movieLanguage = languages;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", movieLength=" + movieLengthInMinutes + ", languages=" + movieLanguage + "]";
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

}
