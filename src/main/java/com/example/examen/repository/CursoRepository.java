package com.example.examen.repository;


import org.springframework.data.mongodb.repository.Query;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.examen.entity.Curso;



public interface CursoRepository extends MongoRepository<Curso, Integer> {
    
    @Query("{ 'idCurso' : ?0 }")
    public abstract Curso buscaCursoPorId(int idCurso);


    @Query("{'nombre': { $regex:  ?0, '$options' : 'i'}}")
    public abstract List<Curso> buscaCursoPorNombre(String nombre);

}
