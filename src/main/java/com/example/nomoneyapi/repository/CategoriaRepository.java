package com.example.nomoneyapi.repository;

import com.example.nomoneyapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Categoria findByCodigo(Long codigo);

}
