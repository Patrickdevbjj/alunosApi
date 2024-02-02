package com.patrick.alunosapi.services;

import com.patrick.alunosapi.entities.Aluno;
import com.patrick.alunosapi.repositories.AlunoRepository;
import com.patrick.alunosapi.services.exceptions.DataBaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new DataBaseException("Aluno não encontrado com o ID: " + id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir o aluno com o ID: " + id, e);
        }
    }
}
