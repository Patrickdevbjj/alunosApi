package com.patrick.alunosapi.controllers;


import com.patrick.alunosapi.entities.Professor;
import com.patrick.alunosapi.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<Professor>> findAll() {
        List<Professor> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Professor> salvarProfessor(@RequestBody Professor professor) {
        Professor professorSalvo = service.save(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professorSalvo);
    }

}
