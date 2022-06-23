package com.example.demo.repository;

import com.example.demo.entities.Genere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movie;

import java.util.List;
import java.util.Set;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> 
{

}
