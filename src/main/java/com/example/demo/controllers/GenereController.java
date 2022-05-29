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

import com.example.demo.entities.Genere;
import com.example.demo.services.GenereService;

@RestController
@RequestMapping("/genre")
public class GenereController {

	@Autowired
	private GenereService genereService;
	
	@PostMapping("/")
	public Genere addGenere(@RequestBody Genere g) {
		return this.genereService.addGenere(g);
	}
	
	@PutMapping("/")
	public Genere updateGenere(@RequestBody Genere g) {
		return this.genereService.updateGenere(g);
	}
	
	
	@GetMapping("/{id}")
	public Genere getGenereById(@PathVariable("id") Long id) {
		 return this.genereService.getGenerebyId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteGenere(@PathVariable("id") Long id) {
		  this.genereService.deleteGenere(id);
	}
	
}
