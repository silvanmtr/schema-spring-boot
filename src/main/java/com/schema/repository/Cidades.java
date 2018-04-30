package com.schema.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schema.model.Cidade;
import com.schema.model.Estado;
import com.schema.repository.helper.cidade.CidadesQueries;

public interface Cidades extends JpaRepository<Cidade, Long>, CidadesQueries {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

	public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
	
}
