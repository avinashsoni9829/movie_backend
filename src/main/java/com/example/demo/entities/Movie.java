package com.example.demo.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import lombok.*;
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie {
    


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	@Getter @Setter private Long mid;
	
	@Getter @Setter private String mname;
	
	@Getter @Setter private String mimage;
	
	
	@Getter @Setter private String mdescription;
	
	@Getter @Setter private Date release_date;
	
	@ManyToMany( cascade = CascadeType.ALL)
	@Getter @Setter private  Set<Genere> generes = new HashSet<Genere>();
	
	
	@ManyToMany(cascade = CascadeType.ALL  )
	@Getter @Setter private Set<Star> cast = new HashSet<Star>();
	
	
	
	
	
}
