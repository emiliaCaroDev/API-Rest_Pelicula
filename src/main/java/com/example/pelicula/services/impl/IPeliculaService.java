package com.example.pelicula.services.impl;

import com.example.pelicula.domains.Pelicula;

import java.util.List;

public interface IPeliculaService {

    List<Pelicula> listarTodosPelicula();

     void eliminarPelicula(Integer id);

    Pelicula buscarPeliculaXId(Integer id);

    Pelicula guardarPelicula(Pelicula pelicula);


}
