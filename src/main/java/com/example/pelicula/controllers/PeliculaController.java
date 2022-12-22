package com.example.pelicula.controllers;

import com.example.pelicula.dao.impl.PeliculaDAO;
import com.example.pelicula.domains.Pelicula;
import com.example.pelicula.services.impl.IPeliculaService;
import com.example.pelicula.services.impl.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    private IPeliculaService peliculaService;//{= new PeliculaService(new PeliculaDAO());


    @Autowired
    public PeliculaController(IPeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    /*@GetMapping("/getAll")
    public List<Pelicula> getAllPeliculas(){
        return peliculaService.listarTodosPelicula();
    }*/

    @GetMapping("/getAll")
    public ResponseEntity<List<Pelicula>> getAllPeliculas(){
        return ResponseEntity.ok(peliculaService.listarTodosPelicula());
    }

    @GetMapping("/{id}")
    public Pelicula getPeliculaXId(@PathVariable("id") Integer id){
        return peliculaService.buscarPeliculaXId(id);
    }

   /*@PostMapping("/new")
    public Pelicula addPelicula(@RequestBody Pelicula pelicula){
        return peliculaService.guardarPelicula(pelicula);
    }*/

    @PostMapping("/new")
    public ResponseEntity<String> addPelicula(@RequestBody Pelicula pelicula){
        //return ResponseEntity.ok(peliculaService.guardarPelicula(pelicula));
        peliculaService.guardarPelicula(pelicula);
        return ResponseEntity.status(200).body("Titulo: "+pelicula.getTitulo()+" \nCategoria: "+pelicula.getCategoria());
    }

   /* @DeleteMapping("/{id}")
    public void deletePelicula(@PathVariable("id") Integer id){
        peliculaService.eliminarPelicula(id);
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePelicula(@PathVariable("id") Integer id){
        ResponseEntity<String> response=null;
        if(peliculaService.buscarPeliculaXId(id)!=null){
            peliculaService.eliminarPelicula(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        }
        else{
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;

    }
}

