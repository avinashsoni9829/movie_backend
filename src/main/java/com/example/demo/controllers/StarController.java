package com.example.demo.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.exception.ItemNotFoundException;
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

import com.example.demo.entities.Star;
import com.example.demo.services.StarService;

import java.util.List;

@RestController
@RequestMapping("/star")
@CrossOrigin("*")
public class StarController {

	@Autowired
	private StarService starService;
	
	
	@PostMapping("/")
	public ResponseEntity<Star> addStar(@RequestBody Star s) {
		return ResponseEntity.ok( this.starService.addStar(s));
	}
	
	
	@PutMapping("/")
	public ResponseEntity<Star> updateStar(@RequestBody Star s) {
		return ResponseEntity.ok( this.starService.addStar(s));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Star> getStarById(@PathVariable("id") Long id) {
		 try{
			 return ResponseEntity.ok(this.starService.getStarById(id));
		 }
		 catch (ItemNotFoundException e){
			 throw new ItemNotFoundException("Cant find Star with Given Id!");
		 }

	}
	
	@DeleteMapping("/{id}")
	public void deleteStar(@PathVariable("id") Long id) {
      try{
		  this.starService.deleteStar(id);
	  }
	  catch (ItemNotFoundException e){
		   throw new ItemNotFoundException("No such Star exists to be deleted!");

	  }

	}
	@GetMapping("/all")
	public List<Star> getAllStars(){
		try{
			List<Star> res = this.starService.getAllStars();
			return res;
		}catch (ItemNotFoundException e){
			throw new ItemNotFoundException("Cannot Retrieve all the stars");
		}
	}

}
