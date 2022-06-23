package com.example.demo.entities;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "genre")

public class Genere {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Getter @Setter   private Long gid;

	@Getter @Setter  @NotNull private  String gname;


	@ManyToMany(cascade = CascadeType.ALL  , mappedBy = "genere")
	@Getter @Setter Set<Movie> movies = new HashSet<>();





}
