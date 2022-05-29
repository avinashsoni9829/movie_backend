package com.example.demo.services;

import com.example.demo.entities.Genere;

public interface GenereService {
     public Genere addGenere(Genere g);
     
     public Genere updateGenere(Genere g);
     
     public Genere  getGenerebyId (Long id);
     
     public void deleteGenere(Long id);
     
     
} 
