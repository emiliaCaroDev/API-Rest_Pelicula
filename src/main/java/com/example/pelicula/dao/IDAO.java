package com.example.pelicula.dao;

import java.util.List;

public interface IDAO<T>{

    T guardar(T t);
    T buscarXId(Integer id);
    void eliminar(Integer id);
    T actualizar(T t);
    List<T> listarTodos();
}
