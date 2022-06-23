package com.example.demo.controllers;

import com.example.demo.entities.Movie;
import com.example.demo.exception.ItemNotFoundException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

import com.example.demo.entities.Genere;
import com.example.demo.services.GenereService;

import java.util.List;

@RestController
@RequestMapping("/genre")
@CrossOrigin("*")
public class GenereController {

	@Autowired
	private GenereService genereService;
	
	@PostMapping("/")
	public ResponseEntity<Genere> addGenere(@RequestBody Genere g) {
		return ResponseEntity.ok(this.genereService.addGenere(g));
	}
	
	@PutMapping("/")
	public ResponseEntity<Genere> updateGenere(@RequestBody Genere g) {

		return ResponseEntity.ok(this.genereService.updateGenere(g)) ;

	}
	
	
	@GetMapping("/{id}")

	public ResponseEntity<Genere> getGenereById(@PathVariable("id") Long id) {

		return ResponseEntity.ok(this.genereService.getGenerebyId(id));
	}
	
	@DeleteMapping("/{id}")
	public void deleteGenere(@PathVariable("id") Long id) {
		try {
			this.genereService.deleteGenere(id);
		}
		catch (ItemNotFoundException e){
			throw new ItemNotFoundException("No such Genere Exist to be deleted !");

		}

	}


	@GetMapping("/all")
	public List<Genere> getAllGenere(){
		try{
			List<Genere>allGenere = this.genereService.getAllGenere();
			return allGenere;
		}catch (ItemNotFoundException e){
			throw new ItemNotFoundException("Cannot Retrieve all the Genre");
		}
	}
	
}
