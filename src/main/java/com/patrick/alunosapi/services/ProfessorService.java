package com.patrick.alunosapi.services;

import com.patrick.alunosapi.entities.Aluno;
import com.patrick.alunosapi.entities.Professor;
import com.patrick.alunosapi.repositories.AlunoRepository;
import com.patrick.alunosapi.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {

        @Autowired
        private ProfessorRepository repository;

        public List<Professor> findAll() {
            return repository.findAll();
        }

        public Professor save(Professor professor) {
            return repository.save(professor);
        }
    }

