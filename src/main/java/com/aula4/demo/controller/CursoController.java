package com.exemplo.sistemaestudantes.controller;

import com.exemplo.sistemaestudantes.model.Curso;
import com.exemplo.sistemaestudantes.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Curso> listar(){
        return service.listarCursos();
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(@PathVariable int id){
        return service.buscarCursoPorId(id);
    }
}