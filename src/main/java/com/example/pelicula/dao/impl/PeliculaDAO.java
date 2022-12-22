package com.example.pelicula.dao.impl;

import com.example.pelicula.dao.IDAO;
import com.example.pelicula.domains.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
@Component
public class PeliculaDAO implements IDAO<Pelicula> {



   private List<Pelicula> listaPeliculas =null;

   @Autowired
    public PeliculaDAO() {
        listaPeliculas= new ArrayList<>();
   }


    @Override
    public Pelicula guardar(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
        return pelicula;
    }

    @Override
    public Pelicula buscarXId(Integer id) {
        Pelicula peliculaEncontrada= null;
        for (Pelicula pelicula : listaPeliculas) {
           if(pelicula.getId()==id){
               peliculaEncontrada=pelicula;
           }
        }
        return peliculaEncontrada;
    }

    @Override
    public void eliminar(Integer id) {
        for (Pelicula pelicula : listaPeliculas) {
            listaPeliculas.remove(pelicula.getId()==id);
        }
    }

    @Override
    public Pelicula actualizar(Pelicula pelicula) {
        return null;
    }

    @Override
    public List<Pelicula> listarTodos() {
        return listaPeliculas;
    }
}
