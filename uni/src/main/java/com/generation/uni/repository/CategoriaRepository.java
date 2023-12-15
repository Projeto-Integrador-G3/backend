package com.generation.uni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.uni.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
	
	List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
