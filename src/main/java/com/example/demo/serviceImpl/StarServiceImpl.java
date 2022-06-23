package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Star;
import com.example.demo.repository.StarRepository;
import com.example.demo.services.StarService;

import java.util.List;

@Service
public class StarServiceImpl implements StarService {
     
	@Autowired
	private StarRepository starRepository;
	
	@Override
	public Star addStar(Star s) {
		return this.starRepository.save(s);
		
	}

	@Override
	public Star updateStar(Star s) {
		return this.starRepository.save(s);
	}

	@Override
	public Star getStarById(Long id) {
		return this.starRepository.getById(id);
	}

	@Override
	public void deleteStar(Long id) {
		this.starRepository.deleteById(id);
	}

	@Override
	public List<Star> getAllStars() {
		return  this.starRepository.findAll();
	}

}
