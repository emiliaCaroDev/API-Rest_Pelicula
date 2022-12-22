package com.example.pelicula;

import com.example.pelicula.dao.impl.PeliculaDAO;
import com.example.pelicula.domains.Pelicula;
import com.example.pelicula.services.impl.PeliculaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PeliculaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculaApplication.class, args);
	}


}
