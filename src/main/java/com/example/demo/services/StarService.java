package com.example.demo.services;

import com.example.demo.entities.Star;

import java.util.List;

public interface StarService {
    public Star addStar(Star s);
    
    public Star updateStar(Star s);
    
    public Star getStarById(Long id);
    
    public void deleteStar(Long id);
    
    public List<Star> getAllStars();

}
