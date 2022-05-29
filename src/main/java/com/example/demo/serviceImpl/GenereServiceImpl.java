package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Genere;
import com.example.demo.repository.GenereRepository;
import com.example.demo.services.GenereService;

@Service
public class GenereServiceImpl implements GenereService {
     
	@Autowired
	private GenereRepository genereRepository;
	
	@Override
	public Genere addGenere(Genere g) {
		return this.genereRepository.save(g);
	}

	@Override
	public Genere updateGenere(Genere g) {
		return this.genereRepository.save(g);
	}

	@Override
	public Genere getGenerebyId(Long id) {
		
		return this.genereRepository.getById(id);
	}

	
	@Override
	public void deleteGenere(Long id) {
	    this.genereRepository.deleteById(id);
	}

}
