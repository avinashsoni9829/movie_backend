package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "star")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Star {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Getter @Setter    private Long sid;
	@Getter @Setter  @NotNull private  String sname;

	@Getter @Setter  @NotNull private String simage;
	
    @ManyToMany(cascade = CascadeType.ALL , mappedBy = "cast")
	@Getter @Setter Set<Movie> movies = new HashSet<>();


}
