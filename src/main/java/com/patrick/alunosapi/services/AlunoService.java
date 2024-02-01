package com.patrick.alunosapi.services;

import com.patrick.alunosapi.entities.Aluno;
import com.patrick.alunosapi.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public List<Aluno> findAll() {
        return repository.findAll();
    }


    public Aluno save(Aluno aluno) {
        listaDeAlunos.add(aluno);
        return repository.save(aluno);
    }

}
