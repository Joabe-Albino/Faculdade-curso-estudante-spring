package com.exemplo.sistemaestudantes.controller;

import com.exemplo.sistemaestudantes.model.Estudante;
import com.exemplo.sistemaestudantes.service.EstudanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {

    private final EstudanteService service;

    public EstudanteController(EstudanteService service) {
        this.service = service;
    }

    @GetMapping("/{matricula}")
    public Estudante buscar(@PathVariable String matricula){
        return service.buscarPorMatricula(matricula);
    }

    // ENDPOINT CRIATIVO
    @GetMapping("/curso/{nomeCurso}")
    public List<Estudante> buscarPorCurso(@PathVariable String nomeCurso){
        return service.buscarPorCurso(nomeCurso);
    }
}