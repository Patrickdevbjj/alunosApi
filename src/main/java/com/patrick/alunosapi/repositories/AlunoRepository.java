package com.patrick.alunosapi.repositories;

import com.patrick.alunosapi.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Alunos, Long> {
}
