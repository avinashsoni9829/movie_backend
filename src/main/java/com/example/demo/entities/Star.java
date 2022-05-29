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
@Table(name = "star")
public class Star {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "star_id")
	private Long sid;
	
	@Getter @Setter private  String sname;
	
	@Getter @Setter private String simage;
	
	
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "star_movie",
    joinColumns = {
    		@JoinColumn(name = "star_id")
    },
    inverseJoinColumns = {
    		@JoinColumn(name = "movie_id")
    }
   
   )
	@Getter  @Setter Set<Movie> films = new HashSet<Movie>();
	
	

}
