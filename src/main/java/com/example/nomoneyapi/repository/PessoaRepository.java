package com.example.nomoneyapi.repository;

import com.example.nomoneyapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

    Pessoa findByCodigo(Long codigo);

}
