package com.example.pelicula.services.impl;

import com.example.pelicula.dao.IDAO;
import com.example.pelicula.dao.impl.PeliculaDAO;
import com.example.pelicula.domains.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeliculaService implements IPeliculaService{

    private IDAO<Pelicula> peliculaIDAO;

    public PeliculaService(){
        peliculaIDAO= new PeliculaDAO();
    }

    @Autowired
    public PeliculaService(IDAO<Pelicula> peliculaIDAO) {
        this.peliculaIDAO = peliculaIDAO;
    }

    @Override
    public List<Pelicula> listarTodosPelicula() {
        return peliculaIDAO.listarTodos();
    }

    @Override
    public void eliminarPelicula(Integer id) {
        peliculaIDAO.eliminar(id);
    }

    @Override
    public Pelicula buscarPeliculaXId(Integer id){
        return peliculaIDAO.buscarXId(id);
    }

    @Override
    public Pelicula guardarPelicula(Pelicula pelicula) {
        return peliculaIDAO.guardar(pelicula);
    }
}
