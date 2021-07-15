package com.example.nomoneyapi.repository;

import com.example.nomoneyapi.model.Lancamento;
import com.example.nomoneyapi.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

        Lancamento findByCodigo(Long codigo);

}

