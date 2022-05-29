package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.services.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	
	// Create Operation 
	@Override
	public Movie addMovie(Movie m) {
		return this.movieRepository.save(m);
	}
    // Update Operation 
	@Override
	public Movie updateMovie(Movie m) {
		return this.movieRepository.save(m);
	}
    // Get Operation
	@Override
	public Movie getMovieById(Long id) {
		return this.movieRepository.getById(id);
	}
    // Delete Operation 
	@Override
	public void deleteMovie(Long id) {
	   
		this.movieRepository.deleteById(id);
	}

}
