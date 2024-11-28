package com.gerenciamentofinanceiro.apigerenciamentofinanceiro.domain;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamentofinanceiro.apigerenciamentofinanceiro.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByDescricao(String descricao);
}
