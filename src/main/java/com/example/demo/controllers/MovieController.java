package com.example.demo.controllers;

import com.example.demo.entities.Genere;
import com.example.demo.exception.ItemNotFoundException;
import com.example.demo.services.GenereService;
import com.example.demo.services.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MovieController {
    
	  // dependency injection : 
	
	  @Autowired
	  private MovieService movieService;

	  @Autowired
	  private GenereService genereService;

	  @Autowired
	  private StarService starService;

	  // /movie/ -> POST with body as Movie  m object 
	  @PostMapping("/")
	  public ResponseEntity<Movie> addMovie(@RequestBody Movie m) {


		   return ResponseEntity.ok(this.movieService.addMovie(m));
	 }
	  
	  
	  @PutMapping("/")
	  public ResponseEntity<Movie> updateMovie(@RequestBody Movie m) {
            return ResponseEntity.ok(this.movieService.addMovie(m));
	 }
	  
	  // /movie/2
	  @GetMapping("/{id}")
	  public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long id) {
           try {
			   ResponseEntity<Movie> getMovie =    ResponseEntity.ok(this.movieService.getMovieById(id));
			   return getMovie;
		   }
		   catch (ItemNotFoundException e){
			   throw new ItemNotFoundException("Item Not Found with given id!");
		   }

	  }
	  
	  @DeleteMapping("/{id}")
	  public void deleteMovie(@PathVariable("id") Long id) {
		  try {
			  this.movieService.deleteMovie(id);
		  }
		  catch (ItemNotFoundException e){
			  throw new ItemNotFoundException("No such item exists to be deleted!");

		  }

	  }

	  @GetMapping("/all")
	   public List<Movie> getAllMovies(){
		  try{
			   List<Movie> res = this.movieService.getAllMovies();
			   return res;
		  }catch (ItemNotFoundException e){
			   throw new ItemNotFoundException("Cannot Retrieve all the Movies");
		  }
	  }

	  @GetMapping("/genere/{gId}")
	  public List<Movie> getAllMoviesUnderGenere(@PathVariable("gId") Long gId){
		    try {
				return this.movieService.getAllMoviesUnderGenere(gId);

			}catch (ItemNotFoundException e){
				 throw new ItemNotFoundException("Cannot Find anyMovies");
			}
	  }


}
