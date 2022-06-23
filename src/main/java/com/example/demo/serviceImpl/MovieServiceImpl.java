package com.example.demo.serviceImpl;

import com.example.demo.entities.Genere;
import com.example.demo.repository.GenereRepository;
import com.example.demo.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.services.MovieService;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private GenereRepository genereRepository;
	
	@Autowired
	private StarRepository starRepository;
	// Create Operation 
	@Override
	public Movie addMovie(Movie m) {

		return this.movieRepository.save(m);
	}
    // Update Operation 
	@Override
	public Movie updateMovie(Movie m) {

		Movie x = this.movieRepository.getById(m.getMid());
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

	@Override
	public List<Movie> getAllMovies() {
		return this.movieRepository.findAll();
	}

	@Override
	public List<Movie> getAllMoviesUnderGenere(Long gId)
	{
		return null;
	}


}
