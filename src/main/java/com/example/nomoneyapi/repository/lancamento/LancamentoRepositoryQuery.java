package com.example.nomoneyapi.repository.lancamento;

import com.example.nomoneyapi.model.Lancamento;
import com.example.nomoneyapi.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface LancamentoRepositoryQuery  {

    Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
