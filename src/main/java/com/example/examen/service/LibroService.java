package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Libro;

public interface LibroService {
     public abstract List<Libro> listaLibros();
    public abstract List<Libro> listaLibrosPorCategoria(String categoria);

    
}
