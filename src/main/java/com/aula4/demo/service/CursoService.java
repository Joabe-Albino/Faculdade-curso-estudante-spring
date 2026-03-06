package com.exemplo.sistemaestudantes.service;

import com.exemplo.sistemaestudantes.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    private List<Curso> cursos = new ArrayList<>();

    public CursoService() {

        cursos.add(new Curso(1,"Engenharia de Software"));
        cursos.add(new Curso(2,"Ciência da Computação"));
        cursos.add(new Curso(3,"Sistemas de Informação"));
        cursos.add(new Curso(4,"Análise e Desenvolvimento de Sistemas"));
        cursos.add(new Curso(5,"Engenharia da Computação"));

    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso buscarCursoPorId(int id) {
        return cursos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}