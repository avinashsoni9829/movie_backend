package com.example.demo.services;

import com.example.demo.entities.Movie;

import java.util.List;

public interface MovieService {
    
	// Create Movie
	public Movie addMovie(Movie m);
	
	// Update Movie 
	public Movie updateMovie(Movie m);
	
	// GetMovieById 
	public Movie getMovieById(Long id);
	
	// Delete a Movie 
	public void deleteMovie(Long id);
	
	
	// get All Movies 

	public List<Movie> getAllMovies();



	// get all Movies under Give Genere
	public List<Movie> getAllMoviesUnderGenere(Long gId);
	// get all Movies under given Star 
	
	
	
}
