package com.example.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Libro;
import com.example.examen.service.LibroService;

@RestController
@RequestMapping("/rest/libro")
public class LibroController {

    @Autowired
    private LibroService service;

    @GetMapping("/listaLibros")
    @ResponseBody
    public List<Libro> listaLibros() {
        return service.listaLibros();
    }

    @GetMapping("/listaLibrosPorCategoria/{categoria}")
    @ResponseBody
    public List<Libro> listaLibrosPorCategoria(@PathVariable("categoria") String categoria) {
        return service.listaLibrosPorCategoria(categoria);
    }
    
}
