package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Movie;
import com.example.demo.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
	  // dependency injection : 
	
	  @Autowired
	  private MovieService movieService;
	  // /movie/ -> POST with body as Movie  m object 
	  @PostMapping("/")
	  public Movie addMovie(@RequestBody Movie m) {
		   return this.movieService.addMovie(m);
		   
	  }
	  
	  
	  @PutMapping("/")
	  public Movie updateMovie(@RequestBody Movie m) {
		  return this.movieService.updateMovie(m);
	  }
	  
	  // /movie/2
	  @GetMapping("/{id}")
	
	  public Movie getMovieById(@PathVariable("id") Long id) {
		   return this.movieService.getMovieById(id);
	  }
	  
	  @DeleteMapping("/{id}")
	  public void deleteMovie(@PathVariable("id") Long id) {
		   this.movieService.deleteMovie(id);
	  }
}
