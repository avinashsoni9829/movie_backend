package com.example.demo.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "genre")
public class Genere {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "genere_id")
	private Long gid;
	
	@Getter @Setter private  String gname;
	
	
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "movie_genre", joinColumns = {
			@JoinColumn(name = "genere_id")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "movie_id")
	}
			
  )
	@Getter @Setter Set<Movie> movies = new HashSet<Movie>();
		
}
