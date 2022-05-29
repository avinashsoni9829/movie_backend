package com.example.demo.services;

import com.example.demo.entities.Movie;

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
	
	// get all Movies under Give Genere
	
	// get all Movies under given Star 
	
	
	
}
