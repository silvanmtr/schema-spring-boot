package com.schema.repository.helper.cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.schema.model.Cliente;
import com.schema.repository.filter.ClienteFilter;

public interface ClientesQueries {

	public Page<Cliente> filtrar(ClienteFilter filtro, Pageable pageable);
	
}
