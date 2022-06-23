package com.example.demo.serviceImpl;

import com.example.demo.exception.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Genere;
import com.example.demo.repository.GenereRepository;
import com.example.demo.services.GenereService;

import java.util.List;

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
		
		return this.genereRepository.findById(id).orElseThrow(
				() -> new ItemNotFoundException("No Genere Found with such id")
		);
	}

	
	@Override
	public void deleteGenere(Long id) {
	    this.genereRepository.deleteById(id);
	}

	@Override
	public List<Genere> getAllGenere() {
		return this.genereRepository.findAll();
	}

}
