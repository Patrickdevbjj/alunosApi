package com.patrick.alunosapi.controllers;

import com.patrick.alunosapi.entities.Aluno;
import com.patrick.alunosapi.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll() {
        List<Aluno> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Long id) {
        Aluno aluno = service.findById(id);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Aluno>> findByNome(@RequestParam String name) {
        List<Aluno> alunos = service.findByName(name);
        return ResponseEntity.ok().body(alunos);
    }

    @PostMapping
    public ResponseEntity<Aluno> salvarAluno( @RequestBody Aluno aluno) {
        Aluno alunoSalvo = service.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Aluno> update(@PathVariable Long id, @RequestBody Aluno aluno) {
        aluno = service.update(id, aluno);
        return ResponseEntity.ok().body(aluno);
    }
}
