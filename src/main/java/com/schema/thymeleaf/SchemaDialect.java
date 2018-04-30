package com.schema.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.schema.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.schema.thymeleaf.processor.MenuAttributeTagProcessor;
import com.schema.thymeleaf.processor.MessageElementTagProcessor;
import com.schema.thymeleaf.processor.OrderElementTagProcessor;
import com.schema.thymeleaf.processor.PaginationElementTagProcessor;

@Component
public class SchemaDialect extends AbstractProcessorDialect {

	public SchemaDialect() {
		super("Schema Dialect", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
	}
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}
