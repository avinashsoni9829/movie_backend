package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Star;
import com.example.demo.services.StarService;

@RestController
@RequestMapping("/star")
public class StarController {

	@Autowired
	private StarService starService;
	
	
	@PostMapping("/")
	public Star addStar(@RequestBody Star s) {
		 return this.starService.addStar(s);
	}
	
	
	@PostMapping("/")
	public Star updateStar(@RequestBody Star s) {
		return this.starService.updateStar(s);
	}
	
	@GetMapping("/{id}")
	public Star getStarById(@PathVariable("id") Long id) {
		 return this.starService.getStarById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStar(@PathVariable("id") Long id) {
		 this.starService.deleteStar(id);
	}
}
