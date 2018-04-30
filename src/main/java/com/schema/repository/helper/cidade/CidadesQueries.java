package com.schema.repository.helper.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.schema.model.Cidade;
import com.schema.repository.filter.CidadeFilter;

public interface CidadesQueries {

	public Page<Cidade> filtrar(CidadeFilter filtro, Pageable pageable);
	
}
