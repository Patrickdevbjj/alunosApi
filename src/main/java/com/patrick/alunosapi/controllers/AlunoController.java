package com.patrick.alunosapi.controllers;

import com.patrick.alunosapi.entities.Alunos;
import com.patrick.alunosapi.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Alunos>> findAll() {
        List<Alunos> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
