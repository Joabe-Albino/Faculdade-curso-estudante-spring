package com.exemplo.sistemaestudantes.service;

import com.exemplo.sistemaestudantes.model.Estudante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudanteService {

    private List<Estudante> estudantes = new ArrayList<>();

    public EstudanteService(){

        estudantes.add(new Estudante("2024001","João Silva","Engenharia de Software",2));
        estudantes.add(new Estudante("2024002","Maria Oliveira","Ciência da Computação",4));
        estudantes.add(new Estudante("2024003","Pedro Santos","Sistemas de Informação",1));

    }

    public Estudante buscarPorMatricula(String matricula){

        return estudantes.stream()
                .filter(e -> e.getMatricula().equals(matricula))
                .findFirst()
                .orElse(null);

    }

    public List<Estudante> buscarPorCurso(String curso){

        return estudantes.stream()
                .filter(e -> e.getCurso().equalsIgnoreCase(curso))
                .toList();

    }
}