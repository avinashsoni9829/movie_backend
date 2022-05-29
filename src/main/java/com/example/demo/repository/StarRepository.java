package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Star;

@Repository
public interface StarRepository extends JpaRepository<Star, Long> {

}
