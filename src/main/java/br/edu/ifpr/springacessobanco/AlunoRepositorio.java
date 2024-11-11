package br.edu.ifpr.springacessobanco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Integer> { }
