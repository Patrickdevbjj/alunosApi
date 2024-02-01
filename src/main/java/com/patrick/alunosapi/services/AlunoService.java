package com.patrick.alunosapi.services;

import com.patrick.alunosapi.entities.Alunos;
import com.patrick.alunosapi.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    public List<Alunos> findAll() {
        return repository.findAll();
    }
}
