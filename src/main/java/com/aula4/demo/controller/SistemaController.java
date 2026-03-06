package com.exemplo.sistemaestudantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SistemaController {

    @GetMapping("/api/sistema/info")
    public Map<String,String> info(){

        Map<String,String> resposta = new HashMap<>();

        resposta.put("sistema","Sistema de Cadastro de Estudantes");
        resposta.put("versao","1.0");
        resposta.put("dataHora", LocalDateTime.now().toString());
        resposta.put("status","operacional");

        return resposta;
    }
}