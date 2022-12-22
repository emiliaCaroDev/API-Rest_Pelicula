package com.example.pelicula.domains;

public class Pelicula {

    private Integer id;
    private String titulo;
    private String categoria;
    private Integer premios;

    //constructor
    public Pelicula(){}

    public Pelicula(Integer id, String titulo, String categoria, Integer premios) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.premios = premios;
    }

    public Pelicula(String titulo, String categoria, Integer premios) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.premios = premios;
    }

    //getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getPremios() {
        return premios;
    }

    public void setPremios(Integer premios) {
        this.premios = premios;
    }

    //toString


    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", premios=" + premios +
                '}';
    }
}
