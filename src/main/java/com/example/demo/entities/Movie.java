package com.example.demo.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter  private Long mid;
	

	@Getter @Setter  private String mname;
	
	@Getter @Setter  private String mimage;
	
	
	@Getter @Setter  private String mdescription;


	@Getter @Setter private Date release_date;


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "genere_movie",
			joinColumns = {@JoinColumn(name = "movie_id" ,referencedColumnName = "mid")},
			inverseJoinColumns = {@JoinColumn(name = "genre_id",referencedColumnName = "gid")}
	)
	@Getter @Setter Set<Genere> genere = new HashSet<>();


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "star_movie",
			joinColumns = {@JoinColumn(name = "movie_id" ,referencedColumnName = "mid")},
			inverseJoinColumns = {@JoinColumn(name = "star_id",referencedColumnName = "sid")}
	)
	@Getter @Setter Set<Star> cast = new HashSet<>();


}
